(function () {
    var handleSignup = $('.submit-signup');
    handleSignup.on('click', function (e) {
        e.preventDefault;
        var reg_success = $('.reg_success');
        var form = $(this).closest('form');
        var email = $('#handleSignup').val();
        var pass = $('#password').val();
        var passConfirm = $('#passwordConfirm').val();
        var firstName = $('#firstName');
        var lastName = $('#lastName');
        var userName = $('#userName');
        var Tracks = $("input[name='Tracks']");
        $.ajax({
            url: form.attr('action'),
            method: 'post',
            data: {
                email: email,
                password: pass,
                passwordConfirm: passConfirm
            },
            mehtod: 'POST',
            cache: false,
            success: function (result) {
                
                var mail_is_exist = result.mailExist;
                var pass_is_confirmed = result.passIsConfirmed;
                var alert_box = form.next().find('h4');
                if (mail_is_exist) {
                    alert_box.removeClass('hidden').text('this mail is already exist!');
                } else if (pass_is_confirmed) {
                    alert_box.removeClass('hidden').text('this password is not confirmed with password conformation!');
                } else if (mail_is_exist && pass_is_confirmed) {
                    alert_box.removeClass('hidden').text('this mail is already exist!<br>this password is not confirmed with password conformation!');
                } else {
                    $.ajax({
                        url: 'SingUp',
                        method: 'post',
                        data: {
                            email: email,
                            password: pass,
                            passwordConfirm: passConfirm,
                            firstName: firstName,
                            lastName: lastName,
                            userName: userName,
                            Tracks: Tracks
                        },
                    });
                }
            },
            error: function () {
                alert('internal server error');
            }
        });
    });
})();