

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioPersona
 */
@WebServlet("/formulario")
public class FormularioPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(UtilidadesServlets.getCabecera("Introduce tus datos"));
		out.println("<h2>Datos de usuario</h2>\r\n" + 
				"<p>Introduzca sus datos</p>\r\n" + 
				"<form action=\"resultado\" method=\"get\">\r\n" + 
				"    <div>Nombre:<input type=\"text\" name=\"nombre\"></div>\r\n" + 
				"    <div>Edad:<input type=\"text\" name=\"edad\"></div>\r\n" + 
				"    <div>Altura:<input type=\"text\" name=\"altura\"></div>  \r\n" +
				"    <div>Lenguajes: </div><div>\r\n" + 
				"    HTML<input type=\"checkbox\" name=\"leng\" value=\"html\">  \r\n" + 
				"    CSS<input type=\"checkbox\" name=\"leng\" value=\"css\">\r\n" + 
				"    Java<input type=\"checkbox\" name=\"leng\" value=\"Java\"></div>" + 
				"    <input type=\"submit\" value=\"Enviar\">\r\n" + 
				"</form>");
		out.println(UtilidadesServlets.getPie());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
