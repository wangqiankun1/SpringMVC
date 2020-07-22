<%--
  Created by IntelliJ IDEA.
  User: Take a bow
  Date: 2020/7/11
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单</title>
    <script src="webjars/jquery/3.2.1/dist/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"studentContrallor/ajax",
                    contentType:"application/json;charset:utf-8",
                    data:'{"stuName":"王乾坤","stuAge":20}',
                    type:"post",
                    success:function x(data) {
                        alert(data);
                        alert(data.stuName);
                        alert(data.stuAge);
                        alert(data.birthday);
                    }
                })
            });
        })
    </script>
</head>
<body>
<%--     <form action="userContrallor/saveStu" method="post">--%>
<%--         学生姓名：<input type="text" name="stuName"><br/>--%>
<%--         学生年龄：<input type="text" name="stuAge"><br/>--%>
<%--         生日：<input type="text" name="birthday"><br/>--%>
<%--         银行卡名称：<input type="text" name="bankCard.name"><br/>--%>
<%--         银行卡密码：<input type="text" name="bankCard.password"><br/>--%>
<%--&lt;%&ndash;         <input type="submit" value="提交！">&ndash;%&gt;--%>
<%--     </form>--%>
<button id="btn">ajax</button>
</body>
</html>
