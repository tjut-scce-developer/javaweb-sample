<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登陆</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->


    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">


    <script src="js/jquery-1.9.0.min.js"></script>
    <script src="js/ServerAddress.js"></script>
    <script src="js/login.js"></script>


</head>

<body>
<input type="hidden" id="abspath" value="${pageContext.request.contextPath}"/>
<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>一个简单的增删改查</strong>javaweb网站学习模板-登陆界面</h1>
                    <div class="description">
                        <p>
                            点击这里下载文档 <a href="#"><strong>《网站使用说明》</strong></a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">

                <%--登陆--%>
                <div id="login" style="display: block">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h3>登陆</h3>
                                <p>请输入您的用户名和密码登陆：</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-key"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <div class="login-form">
                                <div class="form-group">
                                    <label class="sr-only" for="username">用户名</label>
                                    <input type="text" name="form-username" placeholder="用户名..."
                                           class="form-username form-control" id="username">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="password">密码</label>
                                    <input type="password" name="form-password" placeholder="密码..."
                                           class="form-password form-control" id="password">
                                </div>
                                <button class="btn" id="submit">登陆</button>
                                <span>
                                    没有帐号？<a href="javascript:void(0);" id="toRegister">点击注册</a>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>

                <%--注册--%>
                <div id="register" style="display: none">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h3>注册</h3>
                                <p>请输入您的信息：</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-key"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <div class="login-form">
                                <div class="form-group">
                                    <label class="sr-only" for="you_username">用户名</label>
                                    <input type="text" name="form-username" placeholder="用户名..."
                                           class="form-username form-control" id="you_username">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="you_password">密码</label>
                                    <input type="password" name="form-password" placeholder="密码..."
                                           class="form-password form-control" id="you_password">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="you_repassword">确认密码</label>
                                    <input type="password" name="form-password" placeholder="确认密码..."
                                           class="form-password form-control" id="you_repassword">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="you_tel">手机号码</label>
                                    <input type="text" name="form-tel" placeholder="手机号码..."
                                           class="form-username form-control" id="you_tel">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="you_email">邮箱号码</label>
                                    <input type="text" name="form-email" placeholder="邮箱号码..."
                                           class="form-username form-control" id="you_email">
                                </div>
                                <button class="btn btn-warning" id="register_btn">点击注册</button>
                                <span>
                                    已有帐号，<a href="javascript:void(0);" id="toLogin">返回登陆</a>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" title="天津理工大学野生队伍-javaweb网站模板">天津理工大学野生队伍-javaweb网站模板</a></div>


<!-- Javascript -->
<script src="assets/js/jquery-1.11.1.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.backstretch.min.js"></script>
<script src="assets/js/scripts.js"></script>


</body>

</html>