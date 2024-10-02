package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Obtener el valor del campo de texto del formulario
        String name = request.getParameter("name");
					
        // Pasar el valor del nombre como atributo a la JSP de bienvenida
        request.setAttribute("name", name);
	
        // Redirigir a la página de bienvenida JSP
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		
	}

}