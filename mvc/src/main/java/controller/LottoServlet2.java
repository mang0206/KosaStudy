package controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.domain.TimeVO;

@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		HttpSession session = request.getSession();
		ServletContext application = request.getServletContext();
		
		String lotto = (String)application.getAttribute("lotto");

		if(lotto != null) {
			request.getRequestDispatcher("/jspexam/impossible.jsp").forward(request, response);
			return;
		}
		
		String cnt = (String)application.getAttribute("cnt");
		if(cnt==null) {
			application.setAttribute("cnt", "0");
		} else {
			if(Integer.parseInt(cnt) == 2) {
				request.getRequestDispatcher("/jspexam/impossible.jsp").forward(request, response);
				return;
			}
			application.setAttribute("cnt", String.valueOf(Integer.parseInt(cnt)+1));
			
		}
			
		
		int lottoNum = Integer.parseInt(request.getParameter("num"));
		Random ran = new Random();
		int ranNum = ran.nextInt(6)+1;
		System.out.println(lottoNum + " " + ranNum);
		
		LocalDateTime ld = LocalDateTime.now();
		
		TimeVO tv = new TimeVO(ld.getHour(), ld.getMinute());
		request.setAttribute("time", tv);
		
		if(lottoNum == ranNum)
			request.getRequestDispatcher("/jspexam/success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("/jspexam/fail.jsp").forward(request, response);
	}

}
