
debugger
$( document ).ready(function() {
    $("#myBtn").click(function(){
        // var userName = $("#userName").val();
        // var passwordName = $("#password").val();
        var userName = "nabeel";
        var password = "nabeel0";
        console.log(userName + password);
        if(userName === password){
            alert("success");
        }else{
            alert("fail");
            $("div.alert").removeClass("d-none");
        }
    });
});



// $("button").click(function(){
//     $("div.alert").removeClass("d-none");
//   });