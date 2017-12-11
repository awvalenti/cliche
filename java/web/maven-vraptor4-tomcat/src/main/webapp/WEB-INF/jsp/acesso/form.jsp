<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form action="login">
			<fieldset>
				<ul>
					<li>
						<label>Usuario <input name="usuario"></label>
					</li>
					<li>
						<label>Senha <input name="usuario" type="password"></label>
					</li>
					<li>
						<button>Entrar</button>
					</li>
				</ul>
			</fieldset>
		</form>
	</body>
</html>
