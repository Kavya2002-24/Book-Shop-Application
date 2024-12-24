package BookWebApp.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookWeb_Dao.Book_Dao;
import BookWeb_Dto.Book_Dto;

@WebServlet("/register")
public class Book_controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter pw=resp.getWriter();
//		resp.setContentType("text/html");
		
		String bookname=req.getParameter("bookName");
		String bookEdition=req.getParameter("bookEdition");
		float bookPrice=Float.parseFloat(req.getParameter("bookPrice"));
		
		//System.out.println(bookname+bookEdition+bookPrice);
		
		Book_Dto bto=new Book_Dto();
		bto.setBookName(bookname);
		bto.setBookEdition(bookEdition);
		bto.setBookPrice(bookPrice);
		
		
		Book_Dao bdo=new Book_Dao();
		String s1= bdo.insert(bto);
		
	  PrintWriter writer = resp.getWriter();
	    // writer.println("<html>");
         //writer.println("<body>");
	    writer.println("<p>" + s1 + "</p>");  // Display insertion message
	    writer.println("<a href='home.html'>Home</a><br><br>");
	    writer.println("<a href='bookList'>Book List</a>");
	   // writer.println("</body>");
       //  writer.println("</html>");
	}
	
	
}
