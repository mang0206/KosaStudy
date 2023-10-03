package filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/calc" })
public class FilterTest extends HttpFilter implements Filter {
    public FilterTest() {
        super();
        System.out.println("FirstTest 객체 생성....");
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("웹 자원이 수행되기 전....");
		chain.doFilter(request, response);
		System.out.println("웹 자원이 수행된 후....");
	}

}
