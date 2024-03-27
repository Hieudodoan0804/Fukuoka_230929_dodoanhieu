
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Danh sách sinh viên</h1>
    <table border="1" cellspacing="0" cellpadding="5">
        <tr>
            <th>studentId</th>
            <th>address</th>
            <th>birthday</th>
            <th>image</th>
            <th>phoneNumber</th>
            <th>sex</th>
            <th>studentName</th>
        </tr>
        <c:forEach var="s" items="${data}">
            <tr>
                <td>${s.student_id}</td>
                <td>${s.address}</td>
                <td>${s.brithday}</td>
                <td>${s.image_url}</td>
                <td>${s.phone_number}</td>
                <td>${s.sex}</td>
                <td>${s.student_name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
