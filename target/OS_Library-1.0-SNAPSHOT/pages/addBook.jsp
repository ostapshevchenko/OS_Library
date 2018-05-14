<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="templates/imports.jsp"%>
<link rel="stylesheet" href="/resources/css/welcome.css">
<html>
<head>
    <title>OS_Library</title>
</head>
<body>
<a href="/os_library/admin/books"><div class="back-btn" >Book List</div></a>
<div id="div-f1">
    <h1 style="margin-top: 0">Please add book</h1>
    <sf:form action="/os_library/admin/allBooks" method="post" modelAttribute="book" class="f1">
        <table>
            <tr>
                <td><sf:label path="name" >Name*</sf:label></td>
                <td><sf:input type="text" path="name"/></td>
            </tr>
            <tr>
                <td><sf:label path="content">Content*</sf:label></td>
                <td><sf:input type="file" path="content" class="btn"/></td>
            </tr>
            <tr>
                <td><label for="page_count">Page count</label></td>
                <td><sf:input type="text" path="page_count"/></td>
            </tr>
            <tr>
                <td><sf:label path="isbn">ISBN</sf:label></td>
                <td><sf:input type="text" path="isbn"/></td>
            </tr>
            <tr>
                <td><sf:label path="description">Description</sf:label></td>
                <td><sf:input type="text" path="description"/></td>
            </tr>
            <tr>
                <td><sf:label path="image">Image</sf:label></td>
                <td><sf:input type="file" path="image"/></td>
            </tr>
            <tr>
                <td><sf:label path="genre">Genre*</sf:label></td>
                <td>
                    <sf:select path="genre" cssStyle="width: 100%;padding: 12px 20px; margin: 8px 0;box-sizing: border-box; border-radius: 16px;">
                        <sf:option value="NONE" label="Select genre"></sf:option>
                        <sf:options items="${genre}" itemLabel="name" itemValue="id" ></sf:options>
                    </sf:select>
                </td>
            </tr>
            <tr>
                <td><sf:label path="author">Author</sf:label></td>
                <td>
                    <sf:select path="author" cssStyle="width: 100%;padding: 12px 20px; margin: 8px 0;box-sizing: border-box; border-radius: 16px;">
                     <sf:option value="NONE" label="Select author if exists"></sf:option>
                        <sf:options items="${author}" itemLabel="fio" itemValue="id"></sf:options>
                    </sf:select>
                </td>
            </tr>
            <tr>
                <td><label for="publisher">Publisher</label></td>
                <td><sf:input type="text" path="publisher"/></td>
            </tr>
            <tr>
                <td>&nbsp</td>
                <td><input type="submit" value="Save" class="btn" style="
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
