<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Entrada</title>
</head>
<body>
    <h1>Formulario</h1>
    <p>formulario desde JSP.</p>
    <form action="myServlet2" method="post">
        <label for="name">Introduzca su nombre:</label>
        <input type="text" id="name" name="name">
        <button type="submit">Enviar</button>
    </form>
</body>
</html>