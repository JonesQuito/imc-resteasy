package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.Gson;



@Path("/imcjaxrs")
public class ImcJaxRs {
	@GET
	@Path("/calcularimc")
	@Produces("application/json")
	public Imc calcularImc(@QueryParam("peso") double peso, @QueryParam("altura") double altura, @QueryParam("sexo") String sexo){

		Imc	imc = new Imc(peso, altura, sexo);
		
		return imc;
	}
	
	@GET
	@Path("/imc")
	@Produces("application/json")
	public String getTexto(){
		//Imc	imc = new Imc(100, 1.98, "masculino");
		//Gson gson = new Gson();
		
		//return gson.toJson(imc);
		return "sdfsdfsdf";
	}
	

}
