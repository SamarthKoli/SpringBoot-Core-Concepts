package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

import org.eclipse.jdt.internal.compiler.apt.model.Factory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.NoteContainer;
import com.helper.FactoryProvider;


public class NoteSaverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoteSaverServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			String title=request.getParameter("title");
			String descriptionString=request.getParameter("content");
			
			NoteContainer noteContainer=new NoteContainer();
			noteContainer.setTitle(title);
			noteContainer.setDescription(descriptionString);
			
		Session session=FactoryProvider.getFactory().openSession();
			Transaction txTransaction=session.beginTransaction();
			response.setContentType("text/html");
			session.save(noteContainer);
			
			txTransaction.commit();
			
			
			
			session.close();
			
			  response.getWriter().println(
		                "<!DOCTYPE html>" +
		                "<html>" +
		                "<head>" +
		                "    <title>Note Added</title>" +
		                "    <style>" +
		                "        body {" +
		                "            font-family: Arial, sans-serif;" +
		                "            display: flex;" +
		                "            justify-content: center;" +
		                "            align-items: center;" +
		                "            height: 100vh;" +
		                "            margin: 0;" +
		                "            background-color: #f4f4f9;" +
		                "        }" +
		                "        .dialog-box {" +
		                "            background-color: white;" +
		                "            padding: 20px 40px;" +
		                "            border-radius: 8px;" +
		                "            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);" +
		                "            text-align: center;" +
		                "        }" +
		                "        .dialog-box h1 {" +
		                "            color: #4CAF50;" +
		                "            font-size: 24px;" +
		                "        }" +
		                "        .dialog-box p {" +
		                "            margin: 10px 0 20px;" +
		                "            color: #555;" +
		                "        }" +
		                "        .dialog-box a {" +
		                "            text-decoration: none;" +
		                "            color: white;" +
		                "            background-color: #4CAF50;" +
		                "            padding: 10px 20px;" +
		                "            border-radius: 5px;" +
		                "            transition: background-color 0.3s ease;" +
		                "        }" +
		                "        .dialog-box a:hover {" +
		                "            background-color: #45a049;" +
		                "        }" +
		                "    </style>" +
		                "</head>" +
		                "<body>" +
		                "    <div class=\"dialog-box\">" +
		                "        <h1>Note Added Successfully!</h1>" +
		                "        <p>Your note has been saved. You can now view all stored notes.</p>" +
		                "        <a href=\"showNotes.jsp\">View All Notes</a>" +
		                "		<a href=\"index.jsp\">Add More Notes</a>"+
		                "    </div>" +
		                "</body>" +
		                "</html>"
		        );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
