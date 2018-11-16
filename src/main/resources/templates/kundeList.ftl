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

      	<title>Kunden Liste</title>
   </head>   
   <body>
   

		<div class="container"><br>
			<table border="1">
			    <tr>
			       <th>Kundennummer</th>
			       <th>Vorname</th>
			       <th>Nachname</th>
			    </tr>
			    <#list kunden as kunde>
					<tr>
					   <td>${kunde.kundenNummer}</td>
					   <td>${kunde.vorname}</td>
					   <td>${kunde.nachname}</td>
					</tr>
				</#list>
			</table>
		    <br>
			<a href="addKunde" class="btn btn-primary">Neuen Kunden anmelden</a>
		</div>
   </body>
</html>