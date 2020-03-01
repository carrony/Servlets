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
		out.println("<h2>Datos introducidos</h2>\r\n"
				+ "<p>Los datos que has introducido son: </p>\r\n" 
				+ "<p>Nombre: "+ nombre + " </p>\r\n" );
		
		int edad=0;
		if (request.getParameter("edad")!=null && !request.getParameter("edad").equals("")) {
			edad= Integer.parseInt(request.getParameter("edad"));
			out.println("<p>Edad: "+ edad + " </p>\r\n"); 
		} else {
			out.println("<p>Edad: Edad no introducida</p>");
		}
		try {
			float altura = Float.parseFloat(request.getParameter("altura"));
			out.println("<p>Altura: "+ altura + " </p>\r\n");
		} catch (NumberFormatException e) {
			out.println("<p>Altura: "
			    + "Error altura no introducida o formato incorrecto</p>\r\n");
		}
		
		String lenguajes [] = request.getParameterValues("leng");
		out.println("<p>Lenguajes: ");
		for (int i=0; lenguajes!=null && i<lenguajes.length;i++) {
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
