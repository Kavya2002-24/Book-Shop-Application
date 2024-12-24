package BookWebApp.com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookWeb_Dao.Book_Dao;
import BookWeb_Dto.Book_Dto;

@WebServlet("/did")
public class DeleteById extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      int id=Integer.parseInt(req.getParameter("id"));                  
		 System.out.println(id);
		
		
		Book_Dao sdo=new Book_Dao();
		Object msg=sdo.deleteById(id);
		resp.getWriter().print(msg);
//		
		List<Book_Dto> ob=(List<Book_Dto>) sdo.fetchAll();
		req.setAttribute("obj", ob);
		
	       RequestDispatcher r=req.getRequestDispatcher("fetchall.jsp");
	       r.forward(req, resp);
		
	}
}
