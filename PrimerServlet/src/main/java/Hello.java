import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int listaNumeros[];
	private long tiempo;
	
       
	@Override
	public void init() throws ServletException {
		super.init();
		// Inicializamos el vector de números a través de números aleatorios
		listaNumeros = new int[10];
		for (int i=0; i<listaNumeros.length; i++) {
			listaNumeros[i] = (int) (Math.random()*10);
		}
		tiempo = System.currentTimeMillis();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Lista de números aleatorios</h1>");
		out.println("<ul>");
		for (int i=0;i<listaNumeros.length;i++) {
			out.println("<li>"+listaNumeros[i]+"</li>");
		}
		out.println("</ul>");
		long segundos= (System.currentTimeMillis()-tiempo)/1000;
		out.println("El servlet se inicio hace "+segundos+ " segundos");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
