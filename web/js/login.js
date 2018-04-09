/**
 * Created by AT on 2018/4/5.
 */


$(document).ready(function () {

    $("#toRegister").click(function () {
        $("#register").show();
        $("#login").hide();
    });

    $("#toLogin").click(function () {
        $("#register").hide();
        $("#login").show();
    });

    $("#login_bin").click(function () {
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

    $("#register_btn").click(function () {
        var path=$("#abspath").val();
        var username = $("#you_username").val();
        var password = $("#you_password").val();
        var repassword = $("#you_repassword").val();
        var tel = $("#you_tel").val();
        var email = $("#you_email").val()

    });

});

function doAjaxPost(requesturl,data) {
    $.ajax({
        type: "POST",
        url: requesturl,
        data: data,
        dataType: "JSON",
        success: function(result){
            var pagePath=result.pagePath;
            var pageMessage=result.pageMessage;
            if(pageMessage !== 200){
                layer.msg(pageMessage)
            }
            location.href = pagePath;
        }
    });
}

function doAjaxGet(requesturl,data) {
    $.ajax({
        type: "GET",
        url: requesturl,
        data: data,
        dataType: "JSON",
        success: function(result){
            var pagePath=result.pagePath;
            var pageMessage=result.pageMessage;
            if(pageMessage !== 200){
                layer.msg(pageMessage)
            }
            location.href = pagePath;
        }
    });
}