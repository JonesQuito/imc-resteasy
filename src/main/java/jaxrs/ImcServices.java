package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.Gson;



@Path("/imcjaxrs")
public class ImcServices {
	@GET
	@Path("/calcularimc")
	@Produces("application/json")
	public Imc calcularImc(@QueryParam("peso") double peso, @QueryParam("altura") double altura, @QueryParam("sexo") String sexo){

		Imc	imc = new Imc(peso, altura, sexo);
		Gson gson = new Gson();
		gson.toJson(imc);
		
		return imc;
	}
	
	@GET
	@Path("/imc")
	@Produces("application/text")
	public String getTexto(){
		
		return "Retorna um texto qualquer!!";
	}
	

}
