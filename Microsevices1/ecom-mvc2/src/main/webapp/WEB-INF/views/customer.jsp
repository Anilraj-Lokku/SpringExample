<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="ISO-8859-1" />
  <title>Customer Page</title>
  <link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
   rel="stylesheet"
  />
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
 </head>
 <body>
  <div class="container-fluid p-5 bg-info text-white text-center">
   <h1>Customer Page</h1>
   <p>Viewing Customer Information</p>
  </div>

  <div class="container mt-5">
   <div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
     <h3>Customer List</h3>
    </div>
    <div class="col-sm-4"></div>
   </div>
   <div class="row">
    <div class="col-sm-2"></div>
    <div class="col-sm-8">
     <table class="table table-striped table-bordered table-hover">
      <thead>
       <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Mobile</th>
       </tr>
      </thead>
      <tbody>
       <c:forEach var="c" items="${customers}">
        <tr>
         <td>${c.id}</td>
         <td>${c.name}</td>
         <td>${c.mobile}</td>
        </tr>
       </c:forEach>
      </tbody>
     </table>
    </div>
    <div class="col-sm-2"></div>
   </div>
  </div>
 </body>
</html>
