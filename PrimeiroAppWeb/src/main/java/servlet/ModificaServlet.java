package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModificaServlet
 */
public class ModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String texto = request.getParameter("texto");
		HttpSession session = request.getSession();
		
		int resultado = 0;
		
		resultado = (texto.equalsIgnoreCase("Lumah")) ? 1 : resultado;
		resultado = (texto.equalsIgnoreCase("Felipe")) ? 2 : resultado;
		resultado = (texto.equalsIgnoreCase("Amanda")) ? 3 : resultado;
		resultado = (texto.equalsIgnoreCase("Lucas")) ? 4 : resultado;
		resultado = (texto.equalsIgnoreCase("Miguel")) ? 5 : resultado;
		resultado = (texto.equalsIgnoreCase("cauÃ£")) ? 6 : resultado;
		
		switch (resultado) {
		
		case 1:
			texto = texto.replace(texto, "Sai daqui doida.");
			break;
			
		case 2:
			texto = texto.replace(texto, "O criador.");
			break;
			
		case 3:
			texto = texto.replace(texto, "Herbella... Parece um bom nome pra uma marca de roupa de luxo. lel");
			break;
			
		case 4:
			texto = texto.replace(texto, "Lucas... É meio ZaaZ. éverdade esse bilhete.");
			break;
		
		case 5:
			texto = texto.replace(texto, "Miguel... O professor mais agitado e melhor da FAETERJ.");
			break;
			
		case 6:
			texto = texto.replace(texto, "VASCO.");
			break;
			
		default:
			texto = texto.replace("a", "*");
			break;
		}
		
		session.setAttribute("texto", texto);
		
		response.sendRedirect("index.jsp");
	}

}
