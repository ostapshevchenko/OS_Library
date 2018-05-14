<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="templates/imports.jsp"%>
<html>
<head>
    <title>OS_Library</title>
    <link rel="stylesheet" href="/resources/css/welcome.css">
</head>
<body>
<a href="/os_library/admin/addBook"><div style="width: 83px;
    padding: 12px 20px;
    margin-top: 2px;
    box-sizing: border-box;
    border-radius: 16px;
    background: #71FFFF;">new Book</div></a>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Content</th>
        <th>Page count</th>
        <th>ISBN</th>
        <th>Image</th>
        <th>Genre</th>
        <th>Author</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
<c:forEach items="${books}" var="b">
    <tr>
        <td>${b.id}</td>
        <td>${b.name}</td>
        <td>${b.content}</td>
        <td>${b.page_count}</td>
        <td>${b.isbn}</td>
        <td>${b.image}</td>
        <td>${b.genre.name}</td>
        <td>${b.author.fio}</td>
        <td>
            <a href="/os_library/admin/allBooks/delete/${b.name}"
               onclick="return confirm('Are You sure?')" >Delete</a>
        </td>
        <td>
            <a href="/os_library/admin/allBooks/edit/${b.name}">Edit</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
