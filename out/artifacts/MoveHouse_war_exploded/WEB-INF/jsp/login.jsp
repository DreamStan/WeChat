<%--
  Created by IntelliJ IDEA.
  User: Eminem
  Date: 2017/10/2
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>搬家拉货平台</title>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/images/logo.ico" type="image/x-icon" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font-awesome.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/ionicons.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/AdminLTE.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/_all-skins.min.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body>

<div id="container">
  <div class="box box-info">
    <div class="box-header with-border">
      <h3 class="box-title">管理员登录</h3>
    </div>
    <!-- /.box-header -->
    <!-- form start -->
    <form action="/login" class="form-horizontal" method="post">
      <div class="box-body">
        <div class="form-group">
          <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>

          <div class="col-sm-10">
            <input name="uname" type="text" class="form-control" id="inputEmail3" placeholder="用户名">
          </div>
        </div>
        <div class="form-group">
          <label for="inputPassword3" class="col-sm-2 control-label">密码</label>

          <div class="col-sm-10">
            <input name="upwd" type="password" class="form-control" id="inputPassword3" placeholder="密码">
          </div>
        </div>
      </div>
      <div class="box-footer">
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
              <label>
                <input type="checkbox" name="remMe"> 请记住我(三天内自动登录)
              </label>
            </div>
            <button type="submit" class="btn btn-default">取消</button>
            <button type="submit" class="btn btn-info pull-right">登录</button>
          </div>
        </div>
      </div>
      <!-- /.box-footer -->
    </form>
  </div>
</div>

<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/static/js/adminlte.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/demo.js"></script>
</body>
</html>
