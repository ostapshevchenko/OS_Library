<%@include file="templates/header.jsp"%>

<div class="centerDIV allDIVs">

    <table>
        <th>
            <td>Book name</td>
            <td>Author</td>
            <td>Genre</td>
        </th>
        <c:forEach items="${books}" var="b">
        <tr>
            <td>${b.name}</td>
            <td>${b.author.fio}</td>
            <td>${b.genre.name}</td>
        </tr>
        </c:forEach>
    </table>
</div>
<%@include file="templates/footer.jsp"%>
