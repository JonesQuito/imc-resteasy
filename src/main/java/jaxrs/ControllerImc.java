package jaxrs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controllerimc")
public class ControllerImc extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String pesoStr = request.getParameter("peso");
		String alturaStr = request.getParameter("altura");
		String sexo = request.getParameter("sexo");
		
		if((pesoStr == null) || (alturaStr == null) || (sexo == null)){
			request.getRequestDispatcher("view/form-imc.jsp").forward(request, response);
		}
		else if ((pesoStr.isEmpty()) || (alturaStr.isEmpty()) || (sexo.isEmpty())) {

			request.setAttribute("erro", "campo obrigat�rio n�o preenchido!");
			request.setAttribute("url", "view/form-imc.jsp");
			request.getRequestDispatcher("view/erroPage.jsp").forward(request, response);
		}
		else{
			double peso = Double.parseDouble(pesoStr);
			double altura = Double.parseDouble(alturaStr);
			
			Imc imc = new Imc(peso, altura, sexo);
			request.setAttribute("situacao", imc.getSituacao());
			request.setAttribute("imc", imc.getImc());
			request.setAttribute("url", "view/form-imc.jsp");
			request.getRequestDispatcher("view/resultado-imc.jsp").forward(request, response);
		}		

	}

}
