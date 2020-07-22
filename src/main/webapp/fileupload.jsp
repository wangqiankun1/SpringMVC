<%--
  Created by IntelliJ IDEA.
  User: Take a bow
  Date: 2020/7/12
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="studentController/fileupload3" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload">
        <input type="submit" value="上传">
    </form>

</body>
</html>
