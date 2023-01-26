package tetra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/call")
public class AmitabServlet extends HttpServlet {

	public AmitabServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("running amitabh servlet class");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("testing amitab in server");
	}


}
