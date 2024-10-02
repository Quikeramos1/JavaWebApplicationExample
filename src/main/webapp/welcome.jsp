<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Página de Bienvenida</title>
</head>
<body>
    <h1>
        Bienvenida <%= request.getAttribute("name") != null ? request.getAttribute("name") : "Usuario" %>!
    </h1>
</body>
</html>