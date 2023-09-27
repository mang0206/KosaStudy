package controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.domain.TimeVO;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		HttpSession session = request.getSession();
		
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
