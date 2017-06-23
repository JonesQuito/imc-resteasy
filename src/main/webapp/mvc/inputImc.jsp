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


<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$("#btn").click(function(){
		$.get("localhost:9090/imc-resteasy/api/imcjaxrs/imc", function(data){
			$( "#div" ).append(  data );
		}, "text");
	});
</script>
</head>
<body>
<div id="textDiv"></div>
	<header class="cabecalho">
		<h3>Calcula o IMC</h3>
	</header>

	<div class="interface">
		<input type="button" id="btn" value="Calcular" /> 
		<hr>
		<div id="div">
			IMC:
		</div>
		<hr>
	</div>
</body>

</html>