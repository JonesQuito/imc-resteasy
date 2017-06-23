<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Formulário de IMC</title>
<!--link href="css/bootstrap.min.css" rel="stylesheet"-->
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="../css/style.css" />

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 


<script>
function calcular() {
	
	$.ajax({
		url: "http://localhost:9090/imc-resteasy/api/imcjaxrs/calcularimc?peso=80&altura=1.77&sexo=masculino",
		dataType : 'json',
		url : "http://localhost:9090/imc-resteasy/api/imcjaxrs/calcularimc?peso="
					+ document.forms["formulario"].elements["peso"].value
					+ "&altura=" + document.forms["formulario"].elements["altura"].value
					+ "&sexo=" + document.forms["formulario"].elements["sexo"].value ,			
		}).then(function(data) {	
		 $("#imc").html(data.imc);
		 $("#situacao").html(data.situacao);
	});
}
</script>

</head>

<body>
<div id="textDiv"></div>
	<header class="cabecalho">
		<h3>Calcula o IMC</h3>
	</header>

	<div class="interface">
	
		<div class="form">
			<form name="formulario" method="get">
				<label for="peso">Peso:</label> <input class="form-control"
					type="number" step="0.01" name="peso" id="peso"
					placeholder="Informe seu peso" /> <label for="altura" >Altura:</label>
				<input class="form-control" type="number" step="0.01" name="altura"
					id="altura" placeholder="Informe sua alura" /> <label for="sexo">Sexo:</label>
				<select class="form-control" name="sexo" id="sexo" >
					<option value="masculino">Masculino</option>
					<option value="feminino">Feminino</option>
				</select>

				<hr>
				<label for="altura">Altura:</label>
				<button id="button" class="form-control btn btn-success" onclick="calcular()">Calcular IMC</button> 
			
				<hr>
			</form>
			<div class="alert alert-success" role="alert"style="margin-top: 45px">
				<div>
					<label>IMC:</label><p id="imc"></p> 
					<label>Situação:</label><p id="situacao"></p>
				</div>
			</div>

		</div>
	</div>
</body>

</html>