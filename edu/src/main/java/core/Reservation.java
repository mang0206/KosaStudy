package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reservation")
public class Reservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fname");
		String pwd = request.getParameter("pwd");
		String room = request.getParameter("room");
		String[] rq = request.getParameterValues("rq");
		String date = request.getParameter("date");
		
		if(name.length() ==0) {
			RequestDispatcher rd = request.getRequestDispatcher("/first.html");
			rd.forward(request,  response);
			return;
		}
		if(pwd.length() == 0) {
			response.sendRedirect("http://www.daum.net/");
			return;
		}
			
		
		out.printf("<h1>%s님의 예약내용</h1>",name);
		out.print("<hr>");
		out.print("<ul>");
		out.printf("<li>룸 : %s</li>",room);
		out.print("<li>추가 요청 사항 : ");
		if(rq == null) {
			out.print("없음</li>");
		}
		else {
			for(int i=0; i<rq.length; i++) {
				out.printf("%s%s",rq[i], i!=rq.length-1?",":"</li>");
			}
		}
		String[] day = date.split("-");
		out.printf("<li>예약날짜 : %s년 %s월 %s일</li>",day[0], day[1], day[2]);
		out.print("</ul>");
		out.print("<a href='"+request.getHeader("referer")+"'>예약입력화면으로</a>");
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
