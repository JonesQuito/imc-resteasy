$(document).ready(function(){
$("#button").click(function(){
	var peso = $("#peso").val();
	var altura = $("#altura").val();
	var sexo = $("#sexo").val();
	$.ajax({
	    type: "GET",
	    url: "http://localhost:9090/imc-resteasy/api/imcjaxrs/calcularimc?peso="+peso+"&altura="+altura+"&sexo="+sexo,  
	    async: false,
	    dataType: 'json',
	    success: function(data) {
	       $("#div").text(data.imc);
	       $("#situacao").text(data.situacao);
	       $("#idPeso").text(peso);
	       //situacao
	    }
	});
});
});