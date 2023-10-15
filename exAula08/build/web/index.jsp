<%-- 
    Document   : index
    Created on : 15 de out. de 2023, 16:45:56
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSON Data</title>
    </head>
    <body>
        <jsp:include page="WEB-INF/jspf/header.jspf" />
    
    <h2>JSON Data:</h2>
    <div id="json-data"></div>

    <script src="https://cdn.jsdelivr.net/npm/alpinejs@2.8.2/dist/alpine.js" integrity="sha384-mXZg75aDv6vgzLN6AglydmU53JfEnY5p4F9cgFk4lJawg9oyEaV2mpa6jCiSFqkzy" crossorigin="anonymous"></script>
<script>
    fetch('/alex.json')
        .then(response => response.json())
        .then(data => {
            document.getElementById('json-data').innerHTML = JSON.stringify(data, null, 2);
        });
</script>
    </body>
</html>
