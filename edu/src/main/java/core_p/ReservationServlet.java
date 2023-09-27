package core_p;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("guestName");
		String password = request.getParameter("guestPw");
		String room[] = request.getParameterValues("roomName");
		String roomReq[] = request.getParameterValues("roomRequest");		
		String date = request.getParameter("Date");
		String year = date.split("-")[0]; 
		String month = date.split("-")[1];
		String day = date.split("-")[2];
		
		
		
		if (userName == null || userName == "") {			
			RequestDispatcher rd = request.getRequestDispatcher("/first.html");
			rd.forward(request, response);
			return;
		} else {
			out.print("<h1>"+userName+"님의 예약내용</h1><hr>");
		}		
		if (password == null || password == "") {
			response.sendRedirect("http://www.daum.net");
			return;
		}
		out.print("● 룸 : ");
		if (room.length != 0) {			
			for (String f : room)
				out.print(f+" ");
		} else {
			out.print("없음");
		}
		out.print("<br>");
		
		out.print("● 추가 요청 사항 : ");
		if (roomReq != null && roomReq.length != 0) {			
			for (String f : roomReq)
				out.print(f+" ");
		} else {
			out.print("없음");
		}
		out.print("<br>");
		out.print("● 예약날짜 : "+year+"년"+month+"월"+day+"일"+"<br>");
		out.print("<a href='"+request.getHeader("referer")+"'>예약입력화면으로</a>");
		out.close();
	}

}
