package BookWebApp.com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookWeb_Dao.Book_Dao;
import BookWeb_Dto.Book_Dto;

@WebServlet("/update")
public class Update extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookname=req.getParameter("bookName");
		String bookEdition=req.getParameter("bookEdition");
		float bookPrice=Float.parseFloat(req.getParameter("bookPrice"));
		
		//System.out.println(bookname+bookEdition+bookPrice);
		
		Book_Dto bto=new Book_Dto();
		bto.setBookName(bookname);
		bto.setBookEdition(bookEdition);
		bto.setBookPrice(bookPrice);
		
		
		Book_Dao bdo=new Book_Dao();
		 bdo.update(bto);
		//resp.getWriter().print(s1);
		
		resp.getWriter().print("<br><br><a href='home.html'>Home</a>");
		resp.getWriter().print("<br><br>");
		resp.getWriter().print("<a href='bookList'>BookList</a>");
		
		
		Object op1=bdo.fetchAll();
		 req.setAttribute("obj", op1);
		  RequestDispatcher ds=req.getRequestDispatcher("fetchall.jsp");
		  ds.forward(req, resp);
	}
}
