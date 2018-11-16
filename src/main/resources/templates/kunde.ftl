<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html lang="de">
   	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
      	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>"/>      
  		
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

      	<title>Kunde</title>
   </head> 
     
	<body>
		<div class="container">
			<div class="card" style="width:250px">
				<img class="card-img-top" src="<@spring.url '/img/face_comp.png'/>" alt="Card image" style="width:100%">
				<div class="card-body">
					<h4 class="card-title">Hermann Woock</h4>
					<p class="card-text">
						<dl>
							<dt>ID</dt>
								<dd>- 324-3282-523-44</dd>
							<dt>Name</dt>
								<dd>- Hermann Woock</dd>
						</dl>
					</p>
				</div>
			</div>
			<br>
		</div>
	</body>
</html>