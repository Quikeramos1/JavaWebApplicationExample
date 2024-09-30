package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);	
		}			
		
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Obtener el valor del campo de texto del formulario
        String name = request.getParameter("name");



		// Generar la respuesta HTML con el mensaje de bienvenida
        out.println("<html>");
        out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
        out.println("<body>");
        if (name != null && !name.trim().isEmpty()) {
            out.println("<h1>Bienvenida " + name + "!</h1>");
        } else {
            out.println("<h1>Bienvenido/a!</h1>");
            out.println("<p>No se proporcionó un nombre.</p>");
        }
        out.println("</body></html>");
	}

}