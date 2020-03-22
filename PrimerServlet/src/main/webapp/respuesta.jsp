<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Respuesta del formulario</title>
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<body>
	<%! int num=10; %>
	<header> 
		<h1>Curso IFCT034PO - Desarrollo de aplicaciones con java </h1>
	</header>
	<main>
		<h2>Resultado del formulario</h2>
		<p>Nombre: <%=request.getParameter("nombre") %></p>
		<p>Edad: <%=request.getParameter("edad") %></p>
		<p>Altura: <%=request.getParameter("altura") %></p>
	</main>
	<footer>
			<h4>IFCT034PO - Desarrollo de aplicaciones con Java</h4> 
	</footer>
</body>
</html>