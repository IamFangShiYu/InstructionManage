<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>选择身份</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<%@ include file="/view/public/common.jspf" %>

</head>
<body class="login-layout">
	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">
						<div class="center">
							<h1>
								<i class="icon-leaf green"></i> <span class="red">沙县小吃</span> <span
									class="white">点餐管理</span>
							</h1>
							<h4 class="blue"></h4>
						</div>
						<div class="space-6"></div>
						<div class="position-relative">
							<div id="login-box"
								class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue lighter bigger" align="center">
											<i class="icon-coffee green"></i> 请确认你的身份
										</h4>

										<div class="space-6"></div>
										
										<div align="center">
										 <input type="button"   class="btn btn-success"   value="我是商家" onClick="javascript:window.location='${pageContext.request.contextPath}/view/login.jsp'"/>
										
										 <input type="button"   class="btn btn-danger"   value="我是买家" onClick="javascript:window.location='${pageContext.request.contextPath}/view/login2.jsp'"/>
										</div>
									</div>

								</div>

							</div>


					</div>

				</div>
			</div>

		</div>
</div>
	</div>
</body>
</html>
