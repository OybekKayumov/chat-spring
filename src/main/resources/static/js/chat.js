$(function() {
//    alert("Hello!");

    let initApplication = function() {
        $('.messages-and-users').css({display: 'flex'});
        $('.controls').css({display: 'flex'});
        //todo init events
    }

    let registerUser = function() {
        $.post('/auth', {name: name}, function(response) ){
            if(response.result) {
                initApplication();
            } else {

            }

        }
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