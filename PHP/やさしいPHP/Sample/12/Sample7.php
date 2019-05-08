<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<h2>ソースコードの表示</h2>

<form action="http://localhost/YPHPSample/12/Sample7.php" method="post">

<input type="submit" name="program" value="起動"/>
</form>

<?php

if(isset($_POST["program"]))
   exec("notepad.exe Sample1.php");
?>

</body>
</html>
