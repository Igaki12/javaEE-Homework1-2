package servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Number;
import model.CaliculateSum;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException ,IOException {
		
		File f = new File("/WEB-INF/jsp/form.jsp");
		String path = f.getPath();
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException ,IOException {
		
		request.setCharacterEncoding("UTF-8");
		Number number = new Number();
		String strnumber = request.getParameter("number");
		number.setNumber(strnumber);
		CaliculateSum cal = new CaliculateSum();
		int sum = cal.CaliculateSum(strnumber);
		number.setSum(sum);
		request.setAttribute("number", number);
		
		File f2 = new File("/WEB-INF/jsp/result.jsp");
		String path2 = f2.getPath();
		RequestDispatcher dispatcher  = request.getRequestDispatcher(path2);
		dispatcher.forward(request,response);
		}
}