package velocity_sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

public class MyVelocityViewServlet extends VelocityViewServlet {
	private static final long serialVersionUID = 1L;
    protected Template handleRequest(HttpServletRequest request,
            HttpServletResponse response,
            Context ctx)
	{

    	ctx.put("boolTrue", true);
    	ctx.put("boolFalse", false);
    	ctx.put("number", 1234);
    	ctx.put("string", "abcd");
    	ctx.put("list", Arrays.asList("a", "b", "c", "d"));
    	
    	Map<String, String> map = new HashMap<>();
    	map.put("key1", "value1");
    	map.put("key2", "value2");
    	ctx.put("map", map);
    	return super.handleRequest(request, response, ctx);
	}
}
