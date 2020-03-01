import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultado")
public class RespuestaRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(UtilidadesServlets.getCabecera("Datos introducidos"));
		
		String nombre = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));
		float altura = Float.parseFloat(request.getParameter("altura"));
		String lenguajes [] = request.getParameterValues("leng");
		out.println("<h2>Datos introducidos</h2>\r\n"
				+ "<p>Los datos que has introducido son: </p>\r\n" + 
				"  <p>Nombre: "+ nombre + " </p>\r\n" + 
				"  <p>Edad:   "+ edad + " </p>\r\n" + 
				"  <p>Altura: "+ altura + " </p>");
		out.println("<p>Lenguajes: ");
		for (int i=0; i<lenguajes.length;i++) {
			out.println(lenguajes[i]+" ");
		}
		out.println("</p>");
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
