import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebFilter(
    urlPatterns={"/hello"},
    initParams={@WebInitParam(name="simpleParam", value="paramValue")}
)
public class InitParamFilter implements Filter
{
    private FilterConfig filterConfig = null;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException 
	{
        String s = filterConfig.getInitParameter("simpleParam");
        response.getWriter().println("Myfilter1 " + s);

        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException 
	{
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() { }
}
