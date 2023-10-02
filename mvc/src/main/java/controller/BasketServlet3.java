package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;


@WebServlet("/basket3")
public class BasketServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		String pId = request.getParameter("pid");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		JSONObject jsonObj = new JSONObject();
		
		
		if(pId==null) {
			session.invalidate();
			jsonObj.put("msg", "상품이 모두 삭제되었습니다.");
		}
		else {
			if(session.getAttribute("productImage") == null) {
				session.setAttribute("productImage", new int[10]);
			}
			int[] product = (int[])session.getAttribute("productImage");
			product[Integer.parseInt(pId)-1]++;
			
			String name;
			for(int i=0; i<product.length; i++) {
				//System.out.print("pID = " + pId + " : " + product[i] + ", ");
				name = "pid0" + (i+1);
				jsonObj.put(name, product[i]);
			}
			//System.out.println();
			
		}
		out.print(jsonObj);
		out.close();
		
	}

}
