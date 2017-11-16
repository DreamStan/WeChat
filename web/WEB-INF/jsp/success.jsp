<%--
  Created by IntelliJ IDEA.
  User: Eminem
  Date: 2017/10/10
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/images/logo.ico" type="image/x-icon" />
</head>
<body>
添加成功<br>页面将在<span id="num"></span>秒后返回…
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script>
    $(function () {
        var time=setInterval (showTime, 1000);
        var second=3;
        function showTime()
        {
            if(second==0)
            {
                window.location="/busallbus";
                clearInterval(time);
            }
            $("#num").html(second);
            second--;
        }
    })
</script>
</body>
</html>
