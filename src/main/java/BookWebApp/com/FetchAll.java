package BookWebApp.com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookWeb_Dao.Book_Dao;

@WebServlet("/bookList")
public class FetchAll extends HttpServlet{

	@Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		 Book_Dao sd=new Book_Dao();
		Object o=sd.fetchAll();
		// resp.getWriter().print(o);
		 
		 req.setAttribute("obj", o);
		  RequestDispatcher rd=req.getRequestDispatcher("fetchall.jsp");
		 rd.forward(req, resp);
		 
		 
	}
}
