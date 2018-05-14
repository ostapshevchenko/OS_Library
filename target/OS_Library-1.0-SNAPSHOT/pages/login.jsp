<%@include file="templates/imports.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OS_Library</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/welcome.css"/>">
    </head>
<body>
<a href="/os_library"><div class="back-btn">Back</div></a>
<a href="/os_library/logIN?mylocale=en"><img class="logo" src="<c:url value="/resources/img/ukflag.ico"/>" style="width: 20px;
    height: 20px;
    float: left;
    margin-left: 1%;
    margin-top: 0.5%;"></a>
<a href="/os_library/logIN?mylocale=pl"><img class="logo" src="<c:url value="/resources/img/plflag.png" />" style="width: 20px;
                     height: 20px;
                     float: left;
                     margin-left: 1%;
                     margin-top: 0.5%;"></a>
<div class="lDIV">
    <span id = "wlcm"><h3><spring:message key="user.firsttime"/> <br>os_library.com <br><spring:message key="user.title"/></h3></span>

    <div id="div-f1">

        <sf:form class="f1" action="/os_library" method="post" modelAttribute="login" >
            <label for="InputEmail"><spring:message key="user.mail"/> </label>
            <sf:errors path="email" cssStyle="color: red"/>
            <sf:input path="email" id="InputEmail" />

            <label for="InputName"><spring:message key="user.name"/></label>
            <sf:errors path="name" cssStyle="color: red"/>
            <sf:input path="name" name="InputName"/>

            <label for="password"><spring:message key="user.password"/></label>
            <sf:errors path="password" cssStyle="color: red"/>
            <sf:password  path="password" id="InputPassword" />

            <label for="InputConfirm_password"><spring:message key="user.cpassword"/></label>
            <sf:errors path="confirm_password" cssStyle="color: red"/>
            <sf:password path="confirm_password" id ="InputConfirm_password" />

            <spring:message key="user.submit" var="valSubmit"></spring:message>
            <input type="submit" id="logIN-btn" value="${valSubmit}"/>
        </sf:form>
    </div>
</div>
</body>
</html>
