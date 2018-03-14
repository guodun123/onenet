	<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>a</title> 
	</head>
	<script src="../../resources/js/layui.js" charset="utf-8"></script>
	<script src="http://code.jquery.com/jquery-1.4.1.min.js"></script>
	<link rel="stylesheet" href="../../resources/css/layui.css" />
	<link rel="stylesheet" href="../../resources/css/login.css" />
	<body background="../../resources/img/back.jpg">
		<div id="login_back">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				<legend><b>用户登陆</b></legend>
			</fieldset>
			<form class="layui-form" action="">
				<div class="layui-form-item">
					<label class="layui-form-label">登陆名：</label>
					<div class="layui-input-inline">
						<input name="title" lay-verify="title" autocomplete="off" placeholder="请输入账号" class="layui-input" type="text">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
					<div class="layui-input-inline">
						<input name="username" lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input" type="password">
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<a>
						<button class="layui-btn" id="submit" >立即登陆</button></a>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<label class="layui-label"><a>忘记密码？</a> &nbsp;|&nbsp;<a>注册新账号</a>&nbsp;|&nbsp;<a>意见反馈</a></label>
					</div>
				</div>
			</form>
		</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#submit").click(function(){
			alert(1);
		})
		})
	</script>
</body>
</html>
