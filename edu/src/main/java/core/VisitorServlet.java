package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String text = request.getParameter("text");
		String write = String.format("<h2>%s 님이 %d년 %d월 %d일에 남긴 글입니다.</h2> <hr>", 
				name, date.getYear()+1900, date.getMonth()+1, date.getDate());
		out.print(write);
		out.printf("<h4>%s</h4>",text);
		out.print("<a href='"+request.getHeader("referer")+"'>입력화면으로 가기</a>");
		out.close();
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
