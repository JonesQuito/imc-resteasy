package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/imcjaxrs")
public class ImcJaxRs {
	@GET
	@Path("/calcularimc")
	@Produces("application/json")
	public Imc calcularImc(@QueryParam("peso") double peso, @QueryParam("altura") double altura, @QueryParam("sexo") String sexo){
		Imc imc = new Imc(peso, altura, sexo);
		return imc;
	}
	

}
