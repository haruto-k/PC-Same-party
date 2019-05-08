<?php session_start(); ?>

<!DOCTYPE html>

<html>
<head>
<title>サンプル</title>
</head>
<body>

<h2>店内のご案内</h2>
<hr/>

<?php

if(isset($_POST["usr"])){
   $name = $_POST["usr"];
   $_SESSION["usr"] = $name;
}

if(!isset($_SESSION["usr"])){
   print "<form action=\"http://localhost/YPHPSample/Rensyu/10/Sample1.php\" method=\"post\">";
   print "お客様のお名前をどうぞ";
   print "<input type=\"text\" name=\"usr\"/><br/>";
   print "<input type=\"submit\" value=\"送信\"/>";
   print "</form>";
}
else{
   $name = $_SESSION["usr"];
   print "{$name}さん、いらっしゃいませ。<br/>\n";
}

print "</body>";
print "</html>";

?>
