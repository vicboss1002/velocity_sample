package velocity_sample;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/*")
public class EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		res.setCharacterEncoding(StandardCharsets.UTF_8.toString());
		chain.doFilter(req, res);
		
	}

}
