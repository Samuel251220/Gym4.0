$(document).ready(function (){
});
$("#validar").click(function (){
    var x = $("#nick").val();
    var y = $("#pass").val();
    $.post("lg",{"user":x,"pass":y,"op":1});
    /*
    ,function (data) {
        alert(data);
       if(data>0){
           $(location).attr('href', 'http://localhost:9191/v2018/bienvenido');
       }else{           
           $(location).attr('href', 'http://localhost:9191/v2018/home');
       }
    });*/
});