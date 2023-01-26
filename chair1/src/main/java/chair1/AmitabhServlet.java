package chair1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/call")
public class AmitabhServlet extends HttpServlet {
	
	public AmitabhServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("running amitabh servlet class");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("testing amitabh in server");
	}

}
