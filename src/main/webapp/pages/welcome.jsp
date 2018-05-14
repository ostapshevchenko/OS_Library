<%@include file="templates/imports.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OS_Library</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/welcome.css"/>">
</head>
<body>
<a href="/os_library?mylocale=en"><img class="logo" src="<c:url value="/resources/img/ukflag.ico"/>" style="width: 20px;
    height: 20px;
    float: left;
    margin-left: 1%;
    margin-top: 0.5%;"></a>
<a href="/os_library?mylocale=pl"><img class="logo" src="<c:url value="/resources/img/plflag.png" />" style="width: 20px;
                     height: 20px;
                     float: left;
                     margin-left: 1%;
                     margin-top: 0.5%;"></a>
<a href="/os_library/logIN"><div class="log-btn"><spring:message key="user.logIN"></spring:message></div></a>
<div class="mDIV">
    <span id = "wlcm"><h3><spring:message key="user.welcome"/><br>os_library.com</h3></span>
    <div id="div-f1">
        <sf:form class="f1" action="/os_library/main" method="post" modelAttribute="user">
            <label for="name"><spring:message key="user.name"/></label>
            <sf:input path="name"/>
            <label for="password"><spring:message key="user.password"/></label>
            <sf:password path="password" />
            <spring:message key="user.signUp" var="valSignUP"/>
            <input type="submit" id="signUP-btn" value="${valSignUP}">
        </sf:form>
    </div>
</div>
</body>
</html>
