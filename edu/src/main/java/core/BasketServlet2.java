package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String pId = request.getParameter("pid");
		System.out.println(pId);
		
		
		HttpSession session = request.getSession();
		if(pId==null) {
			session.invalidate();
			out.print("<h2>선택된 상품이 없습니다.</h2>");
			out.print("<hr>");
			out.print("<a href='/edu/clientexam/productlog2.html'>상품 선택 화면</a>");
			out.close();
			return;
		}
		out.print("<h2>선택한 상품 리스트</h2>");
		out.print("<hr>");
		if(session.getAttribute("productImage") == null) {
			session.setAttribute("productImage", new int[10]);
		}
		int[] product = (int[])session.getAttribute("productImage");
		product[Integer.parseInt(pId.substring(1))-1]++;
		
		out.print("<ul>");
		for(int i=0; i<product.length; i++) {
			if(product[i] != 0) {
				out.printf("<li> p%d 상품 %d개</li>", i+1, product[i]);
			}
		}
		out.print("</ul>");
		
		
		out.print("<a href='"+request.getHeader("referer")+"'>상품 선택 화면</a> ");
		out.print("<a href='/edu/basket2'>상품비우기</a>");
		out.close();

	}

}
