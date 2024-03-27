<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024/03/27
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Thêm mới sinh viên</title>
</head>
<body>
  <h1>Thông tin sinh viên</h1>
  <f:form method="post" >
    <table>
      <tr>
        <th>Mã sinh viên</th>
        <td><f:input path="student_id"/></td>
      </tr>
      <tr>
        <th>Địa chỉ</th>
        <td><f:input path="address"/></td>
      </tr>
      <tr>
        <th>Ngày sinh</th>
        <td><f:input path="brithday"/></td>
      </tr>
      <tr>
        <th>Ảnh</th>
        <td><f:input path="image_url"/></td>
      </tr>
      <tr>
        <th>Số điện thoại</th>
        <td><f:input path="phone_number"/></td>
      </tr>
      <tr>
        <th>Giới tính</th>
        <td><f:input path="sex"/></td>
      </tr>
      <tr>
        <th>Tên</th>
        <td><f:input path="student_name"/></td>
      </tr>
    </table>
    <button>Lưu</button>
  </f:form>
</body>
</html>
