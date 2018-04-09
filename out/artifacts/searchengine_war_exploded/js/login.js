/**
 * Created by AT on 2018/4/5.
 */


$(document).ready(function () {

    $("#submit").click(function () {
        var path=$("#abspath").val();
        var username = $("#username").val();
        var password = $("#password").val();
        $.ajax({
            type: "POST",
            url: path+ServerAddress.Login,
            data: {
                username:username,
                password:password
            },
            dataType: "JSON",
            success: function(result){
                var pagePath=result.pagePath;
                var pageMessage=result.pageMessage;
                location.href = pagePath;//不做字符串剪切的话，会在路径里面留有两个“”
            }
        });

    });

});