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
      	
      	<title>Kunden hinzufügen</title>
   	</head>
   	
   	<body>
		<#if errorMessage??>
      		<div style="color:red;font-style:italic;">
         		${errorMessage}
      		</div>
      	</#if>
       
		<div class="container">
			<fieldset>
            	<h2>Kunden</h2>
            	<form name="kunde" action="" method="POST">
               	<div class="form-group">
               	 	<label for="kundennummer">Kundennummer:</label> <br/>
               		<@spring.formInput "kundeForm.kundenNummer" "" "text"/> <br/>
               	</div>
            	<div class="form-group">
            		<label for="vorname">Vorname:</label> <br/>
               		<@spring.formInput "kundeForm.vorname" "" "text"/>    <br/>
               	</div>
               	<div class="form-group">
               	 	<label for="nachname">Nachname:</label> <br/>
               		<@spring.formInput "kundeForm.nachname" "" "text"/>    <br/>
               	</div>
               		<input type="submit" value="Anmelden" />
            	</form>
         	</fieldset>
      	</div>
			
   </body>
</html>