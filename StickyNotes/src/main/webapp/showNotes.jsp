<%@page import="com.Entities.NoteContainer"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<html>
<head>

<%@include file="utility.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


<div class="container">
<%@include file="navbar.jsp" %>
<br>
<h1 class="text-uppercase flex text-center">
Your Notes
</h1>

<% 

	Session s=FactoryProvider.getFactory().openSession();
	Query q=s.createQuery("from com.Entities.NoteContainer");
	List<NoteContainer>list=q.list();
	for(NoteContainer note:list){
		out.println("<div class='container'>"); // Bootstrap container
		out.println("    <div class='row gx-2 gy-2 justify-content-center'>"); // Row with reduced horizontal and vertical gap
		out.println("        <div class='col-md-4'>"); // Column for each card
		out.println("            <div class='card' style='width: 18rem;'>");
		out.println("                <img src='img/sticky-notes.png' class='card-img-top ' alt='Card image'  style='height: 65px; width:70px;'> "); // Replace with your image URL
		out.println("                <div class='card-body'>");
		out.println("                    <h5 class='card-title text-center'>" + note.getTitle() + "</h5>"); // Centered title
		out.println("                    <p class='card-text text-center'>" + note.getDescription() + "</p>"); // Centered description
		out.println("                    <div class='d-flex  mx-4 justify-content-center'>"); // Center the button
		out.println("<a href='DeleteNote?note_id=" + note.getId() + "' class='btn btn-primary'>Delete</a>");
		out.println("<a href='editNote.jsp?note_id=" + note.getId() + "' class='btn btn-primary'>Edit</a>");
		
		out.println("                    </div>");
		out.println("                </div>");
		out.println("            </div>");
		out.println("        </div>");
		out.println("    </div>");
		out.println("</div>");


		
	}
	s.close();
	
	
	




%>


</div>

</body>


</html>