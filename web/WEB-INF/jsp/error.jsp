<%--
  Created by IntelliJ IDEA.
  User: Eminem
  Date: 2017/10/19
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ERROR</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/images/logo.ico" type="image/x-icon" />
</head>
<body>
添加失败<br>页面将在<span id="num"></span>秒后返回…
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script>
    $(function () {
        var time=setInterval (showTime, 1000);
        var second=3;
        function showTime()
        {
            if(second==0)
            {
                window.location="/addbus";
                clearInterval(time);
            }
            $("#num").html(second);
            second--;
        }
    })
</script>
</body>
</html>
