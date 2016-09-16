package lab;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;

/**
 * Servlet implementation class ServletNonStatic
 */
@WebServlet("/ServletNonStatic")
public class ServletNonStatic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Logger logger;
	//private Logger logger = LoggerFactory.getLogger(ServletNonStatic.class);

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNonStatic() {
        super();
        //logger.info("ServletNonStatic");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("ServletNonStatic.doGet()");
		response.getOutputStream().write("Ok".getBytes());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
