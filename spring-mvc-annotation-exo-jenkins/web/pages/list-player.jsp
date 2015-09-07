<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<c:if test="${not empty error}">
	<label style="color:red;"><c:out value="${error}"/></label>
</c:if>
	
	<table>
		<tbody>
			<tr>
				<th>Id</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Actions</th>
			</tr>
			<c:forEach items="${players}" var="player">
				<tr>
					<td>${player.id}</td>
					<td>${player.firstName}</td>
					<td>${player.lastName}</td>
					<td><a href="edit.do?id=${player.id}">éditer</a>
						<a href="delete.do?id=${player.id}">supprimer</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="new.do">Nouvelle personne</a>
</body>
</html>