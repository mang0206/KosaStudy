package core_p;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2_2")
public class BasketServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String iid = request.getParameter("pid");
		if (iid == null) {
			session.invalidate();
			out.print("<h2>선택한 상품이 없습니다.</h2>");
			out.print("-----------------------------<br>");
			out.print("<a style='text-decoration-line:none;' href='/edu/clientexam/productlog2.html'>상품선택화면</a>");
			out.close();
			return;
		}
				
		if(session.getAttribute("cnt") == null) {
			session.setAttribute("cnt", new int[10]);
		}
		
		int iiid = Integer.parseInt(iid.substring(2));
		int[] count = (int[])session.getAttribute("cnt");
		count[iiid-1]++;
			
		out.print("<h1>선택한 상품 리스트</h1><br>");
		out.print("---------------------------------");
		out.print("<ul>");
		for (int i = 0; i<count.length; i++) {
			if (count[i] != 0) {
				out.print("<li> p"+(i+1)+" 상품 "+count[i]+"개</li><br>");				
			}
		}
		out.print("</ul>");
		out.print("<a style='text-decoration-line:none;' href='"+request.getHeader("referer")+"'>상품선택화면</a> ");		
		out.print(" <a style='text-decoration-line:none;' href='/edu/basket2'>상품 비우기</a>");
		out.close();
	}

}
