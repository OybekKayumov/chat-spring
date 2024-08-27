$(function() {
   // alert("Hello!");
    let updateMessages = function() {
        $.get('/message', {}, function(response) {
            for
        })
    }

    let initApplication = function() {
        $('.messages-and-users').css({display: 'flex'});
        $('.controls').css({display: 'flex'});

        $('.send-message').on('click', function() {
            let message = $('.new-message').val();
            $.post('/message', {message: message}, function(response) {

                if(response.reult) {
                    $('.new-message').val('')
                } else {
                    alert('Error: (Try later)');
                }
            });
        })
    }

    let registerUser = function() {
        $.post('/auth', {name: name}, function(response) {
            if(response.result) {
                initApplication();
            }

        })
    }


     $.get('init', {}, function(response) {
          if(!response.result) {
                let name = prompt("Enter Your Name: ")
                registerUser(name);
                return;
          } else {
            initApplication
          }
    })
});