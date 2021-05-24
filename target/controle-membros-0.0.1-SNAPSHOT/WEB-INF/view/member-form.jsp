<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Membros | Pq. Esperança</title>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">
<script href="<c:url value="/resources/js/jquery.js" />"></script>
<script href="<c:url value="/resources/js/bootstrap.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Cadastro de Membros - Pq. Esperança</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Cadastrar membro</div>
				</div>
				<div class="panel-body">
					<form:form action="saveMember" cssClass="form-horizontal"
						method="post" modelAttribute="Member">

						<!-- need to associate this data with Member id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="nome" class="col-md-3 control-label">Nome</label>
							<div class="col-md-9">
								<form:input path="nome" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="nomeCompleto" class="col-md-3 control-label">Nome completo</label>
							<div class="col-md-9">
								<form:input path="nomeCompleto" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="cabeca" class="col-md-3 control-label">Cabeça (responsável)</label>
							<div class="col-md-9">
								<form:input path="cabeca" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Cadastrar</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>