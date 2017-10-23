<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
        <title>Principal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
  <form class="col-sm-2" action="controlador" method="POST">
  <div class="form-group">
    <label for="usuario">Usuario</label>
    <input type="text" class="form-control"  placeholder="Usuario" name="usuario">
  </div>
  <div class="form-group">
    <label for="contraseña">Contraseña</label>
    <input type="text" class="form-control" placeholder="contraseña" name="contraseña">
  </div>
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
    </body>
</html>
