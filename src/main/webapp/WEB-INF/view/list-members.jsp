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
  <div class="col-md-offset-1 col-md-10">
   <h2>Controle de Membros</h2>
   <hr />

   <input type="button" value="Adicionar Membro"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Lista de Membros</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>Nome</th>
       <th>Nome Completo</th>
       <th>Cabeça</th>
       <th>Ação</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempMembers" items="${members}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/member/updateForm">
        <c:param name="memberId" value="${tempMembers.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/member/delete">
        <c:param name="memberId" value="${tempMember.id}" />
       </c:url>

       <tr>
        <td>${tempMember.nome}</td>
        <td>${tempMember.nomeCompleto}</td>
        <td>${tempMember.cabeca}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Tem certeza em excluir este membro?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
  </div>

 </div>
</body>
</html>