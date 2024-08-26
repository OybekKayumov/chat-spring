$(function() {
//    alert("Hello!");
    $('.send-message').on('click', function() {
//        alert("Hello, click!");
         $.get('init', {}, function(response) {
            alert(response)
         })
    })
});