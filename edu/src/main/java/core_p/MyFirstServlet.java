package core_p;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/myfirst" })
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("name");
		String answer = "";
		LocalDate now = LocalDate.now();
		var dayOfWeek = now.getDayOfWeek();
		if(dayOfWeek.getValue() == 1) {
			answer = "월";
		}else if (dayOfWeek.getValue() == 2) {
			answer = "화";
		}else if (dayOfWeek.getValue() == 3) {
			answer = "수";
		}else if (dayOfWeek.getValue() == 4) {
			answer = "목";
		}else if (dayOfWeek.getValue() == 5) {
			answer = "금";
		}else if (dayOfWeek.getValue() == 6) {
			answer = "토";
		}else if (dayOfWeek.getValue() == 7) {
			answer = "일";
		}
		System.out.println(answer);
		if (userName != null){
			out.print("<h2> "+userName+"님 반가워요. 오늘은 "+answer+"요일입니다!! </h2>");
		} else {
			out.print("<h2> GUEST님 반가워요. 오늘은 "+answer+"요일입니다!! </h2>");
		}

		out.close();
		
	}
	

}
