<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Primeira Aplicação Java</title>
<link rel="icon" type="image/x-icon"
	href="http://www.rw-designer.com/icon-image/20362-128x128x32.png" />
<link rel="stylesheet" href="styles.css" />
</head>
<body>
	<div id="box">
		<h1>Primeira Aplicação Web</h1>
		<br />
		<hr />
		<%String txt = (String) session.getAttribute("texto"); %>
		<%=txt %>
		<hr />
		<form action="ModificaServlet" method="post">
			<input type="text" id="texto" name="texto" /> <br /> <input
				type="submit" id="botao" value="Enviar" />
		</form>
	</div>
</body>
<footer>
	<p>Felipe Menezes, Amanda Herbella © Existe a possiblidade de
		direitos reservados.</p>
</footer>
</html>