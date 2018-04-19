<%--
  Created by IntelliJ IDEA.
  User: Ali
  Date: 4/18/2018
  Time: 11:13 PM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Simple Login Form</title>
    <script src="../../Scripts/jquery/jquery-3.3.1.min.js"></script>
    <script src="../../Scripts/bootstrap/js/bootstrap.js"></script>

    <link rel="stylesheet" type="text/css" href="../../Scripts/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../Scripts/LoginScripts/custom.css">


    <jsp:include page="/assets/includes.jsp"></jsp:include>

</head>
<body>
<div class="login-form col-sm-8">
    <form action="" method="post">
        <h2 class="text-center">گروه کاربری</h2>
        <div class="form-group">
            <input type="text" class="form-control rtl" placeholder="کد" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control rtl" placeholder="نام گروه کاربری" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">جستجو</button>
        </div>
        <%--<div class="clearfix">
            <label class="pull-left checkbox-inline"><input type="checkbox"> Remember me</label>
            <a href="#" class="pull-right">Forgot Password?</a>
        </div>--%>
    </form>
    <%--<p class="text-center"><a href="#">Create an Account</a></p>--%>
</div>
</body>
</html>