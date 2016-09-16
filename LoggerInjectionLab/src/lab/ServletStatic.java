package lab;

import java.io.IOException;
import java.util.logging.Logger;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletStatic
 */
@WebServlet("/ServletStatic")
public class ServletStatic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private static Logger logger;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletStatic() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("ServletStatic.doGet()");
        System.out.println(LabUtils.getText());
        response.getOutputStream().write("Ok".getBytes());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
