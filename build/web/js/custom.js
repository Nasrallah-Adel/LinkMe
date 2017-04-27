
/*global $ , alert , console */
    $(window).ready(function () {
        'use strict';
        var myheader = $('.header');

        $('html').niceScroll();

        myheader.height($(window).height());
        $(window).resize(function () {
            myheader.height($(window).height());
        })
        // links add active
        $('.nav li').click(function () {
            $(this).addClass('active').siblings().removeClass('active');
            $('html').niceScroll();
        });
        var scrollButton = $('#scroll');
        $(window).scroll(function () {
            if ($(this).scrollTop() >= 700) {
                scrollButton.css({
                    'right': '15px'
                }).animate(10000);
            }
            else {
                scrollButton.css({
                    'right': '-45px'
                }).animate(10000);
            }
        });
        // scroll up


    scrollButton.click(function(){
        $("html,body").animate({scrollTop:0},600);
    });
});
