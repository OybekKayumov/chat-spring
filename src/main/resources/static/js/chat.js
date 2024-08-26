$(function() {
//    alert("Hello!");

    let initApplication = function() {

    }

    let registerUser = function() {
        $.post('/auth', {name: name}, function(response) )
    }

    $('.send-message').on('click', function() {
//        alert("Hello, click!");
         $.get('init', {}, function(response) {
//            alert(response)
              if(response == false) {
                    let name = prompt("Enter Your Name: ")
              } else {

              }
         });
    })
});