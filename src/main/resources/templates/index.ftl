<#import "/spring.ftl" as spring/>
 
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet"
           type="text/css" href="<@spring.url '/css/style.css'/>"/>
   </head>
    
   <body>
      <h1>Welcome</h1>
      <#if message??>
      <h2>${message}</h2>
      </#if>
     
          
      <a href="<@spring.url '/kunden/kundeList'/>">Kunde List</a>
      <a href="<@spring.url 'kunden/kunde'/>">Kunde</a>   
       
   </body>
    
</html>