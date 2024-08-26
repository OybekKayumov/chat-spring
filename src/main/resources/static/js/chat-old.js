$(function() {
//    alert("Hello!");

    let initApplication = function() {
        $('.messages-and-users').css({display: 'flex'});
        $('.controls').css({display: 'flex'});
        //todo init events
    }

    let registerUser = function() {
        $.post('/auth', {name: name}, function(response) )
    }

    $('.send-message').on('click', function() {
//        alert("Hello, click!");
         $.get('init', {}, function(response) {
//            alert(response)
              if(!response.result) {
                    let name = prompt("Enter Your Name: ")
              } else {

              }
         });
    })
});