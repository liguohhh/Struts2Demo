<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <title>登录</title>
</head>
<body>
<s:form action="login" >
    <s:textfield name="username" label="用户名称"></s:textfield>
    <br>
    <s:textfield  name="password" label="用户密码"></s:textfield>
    <br>
    <s:submit value="登录"></s:submit>
    <br>
</s:form>
</body>
</html>