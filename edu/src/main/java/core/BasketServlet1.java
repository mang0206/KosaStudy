package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket1")
public class BasketServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String pId = request.getParameter("pid");
		System.out.println(pId);
		out.printf("<h2>선택한 상품 : %s</h2>", pId);
		out.printf("<img src=/edu/images/%s.jpg>",pId.substring(1));
		out.print("<hr>");
		out.print("<a href='"+request.getHeader("referer")+"'>상품 선택 화면</a>");
		out.close();
	}

}
