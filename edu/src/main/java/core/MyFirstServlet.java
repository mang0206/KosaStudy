package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/myfirst")
public class MyFirstServlet extends HttpServlet {
	Date date = new Date();
	int day = date.getDay();
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		name = name != null ? name: "GUEST";
		String[] dayKor = {"일","월","화","수","목","금","토"};
		String write = String.format("<h2>%s님 반가워요. 오늘은 %s요일입니다.</h2> ", name, dayKor[day]);
		out.print(write);
		out.close();
	}

}
