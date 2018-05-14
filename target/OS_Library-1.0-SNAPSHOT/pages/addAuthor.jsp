<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="templates/imports.jsp"%>

<html>
<head>
    <title>OS_Library</title>
    <link rel="stylesheet" href="/resources/css/welcome.css">
</head>
<body>
<a href="/os_library/admin/allBooks"><div class="back-btn" >Book List</div></a>
<div id="div-f1">
    <h1 style="margin-top: 0">Please add Author</h1>

    <sf:form action="/os_library/admin/authorAdded" method="post" modelAttribute="author" class="f1">
        <table>
            <tr>
                <td><sf:label path="fio" >Name*</sf:label></td>
                <td><sf:input type="text" path="fio"/></td>
            </tr>
            <tr>
                <td><sf:label path="birthday">Birthday</sf:label></td>
                <td><sf:input type="date" path="birthday" class="btn"/></td>
            </tr>
            <tr>
                <td>&nbsp</td>
                <td><input type="submit" value="Save Author" class="btn" style="
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border-radius: 16px;
    float: right;
    background: #AAC1FF;"></td>
            </tr>
        </table>
    </sf:form>

</div>
</body>
</html>
