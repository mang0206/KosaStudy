package core_p;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/visitor" })
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate curDate = LocalDate.now();
				
		int year = curDate.getYear();
		int month = curDate.getMonthValue();
		int date = curDate.getDayOfMonth();
		
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("guestName");
		String post = request.getParameter("post_add");
		
		out.print("<h2> "+userName+"님이 "+year+"년"+month+"월"+date+"일에 남긴 글입니다. </h2>");
		out.print("<h2>"+post+"</h2>");
		out.print("<a href='"+request.getHeader("referer")+"'>입력화면으로 가기</a>");
		out.close();
	}

}
