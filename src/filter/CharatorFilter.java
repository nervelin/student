package filter;

import javax.servlet.*;
import java.io.IOException;

public class CharatorFilter implements Filter {
    private String encoding = null;
    @Override
    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if(encoding!=null)
        {
            request.setCharacterEncoding(encoding);
            response.setContentType("text/html;charset="+encoding);
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
