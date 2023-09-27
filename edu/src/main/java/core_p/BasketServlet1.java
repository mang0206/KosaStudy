package core_p;

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
		response.setContentType("text/html; charset=utf-8");
		String iid = request.getParameter("pid");		
		String imgNo = iid.split("p0")[1];
		PrintWriter out = response.getWriter();
		out.write("<h2>선택한 상품 : "+iid+"<br>");
		out.write("<img src=/edu/images/"+imgNo+".jpg><br>");
		out.print("<a href='"+request.getHeader("referer")+"'>상품 선택 화면</a>");		
	}

}
