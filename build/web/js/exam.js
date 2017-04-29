/**
 * Created by Hoda Ahmed on 4/1/2017.
 */

$('div .checkbox').click(function () {
    checkedState = $(this).attr('checked');
    $(this).parent('div').children('.checkbox:checked').each(function () {
        $(this).attr('checked', false);
    });
    $(this).attr('checked', checkedState);
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
