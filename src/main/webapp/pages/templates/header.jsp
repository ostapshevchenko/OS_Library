<%@include file="imports.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OS_Library</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/temp.css"/>">
</head>
<body>
<header>
    <a href="/os_library/main?mylocale=en"><img class="logo" src="<c:url value="/resources/img/ukflag.ico"/>" style="width: 20px;
    height: 20px;
    float: left;
    margin-left: 1%;
    margin-top: 0.5%;"></a>
    <a href="/os_library/main?mylocale=pl"><img class="logo" src="<c:url value="/resources/img/plflag.png" />" style="width: 20px;
                     height: 20px;
                     float: left;
                     margin-left: 1%;
                     margin-top: 0.5%;"></a>
    <img id="librIMG"  src="<c:url value="/resources/img/libr.png"/>">

    <h1><spring:message key="user.forU">OS_Library is for You</spring:message></h1>

    <span style="float: right; margin-top: -14px ; margin-right: 155px"> <spring:message key="user.hello"></spring:message>${username.name}!</span>

    <a href="#"><div class="log-out-btn" style="position: absolute; right: 4%;top: 6%;width: 5%;padding: 12px 20px;margin: 3px 0;border-radius: 16px; background: #AAC1FF;"><img src="<c:url value="/resources/img/user.png"/>"  style="width: 40px;height: 40px;" class="imgUser"><spring:message key="user.logout"/></div></a>
</header>
<div class="leftDIV , allDIVs">
<nav>
<ul>
    <c:forEach items="${genres}" var="g">
        <a class="a1" href="#"><li>${g.name}</li></a>
    </c:forEach>
</ul>
</nav>
</div>