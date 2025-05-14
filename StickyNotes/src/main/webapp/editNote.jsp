<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.Entities.NoteContainer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit your note</title>
  <%@include file="utility.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp" %>
<% 
int note_id=Integer.parseInt(request.getParameter("note_id"));
Session s=FactoryProvider.getFactory().openSession();
NoteContainer note =s.get(NoteContainer.class,note_id);



%>
  
   <div class="container mt-5">
  
    <h2 class="text-center mb-4 font">Edit the Note</h2>
    
    <form action="EditNote" method="post">
      <div class="mb-3">
        <label for="taskTitle"  class="form-label">Note Title</label>
        <input type="text" value=<%=note.getTitle() %> name="title"class="form-control" id="taskTitle"  required>
      </div>
      <div class="mb-3">
        <label for="taskDescription" class="form-label">Note Description</label>
        <textarea class="form-control" <%=note.getDescription() %> name="content"id="taskDescription" rows="3"  required></textarea>
      </div>
       <div class="d-flex justify-content-center">
        <button type="submit" class="btn btn-primary">Save and Update</button>
      </div>
    </form>
  </div>





</body>
</html>