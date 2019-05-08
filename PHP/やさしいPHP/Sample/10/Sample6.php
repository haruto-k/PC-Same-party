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

if(!isset($_SESSION["count"])){
   $_SESSION["count"] = 1;
   print "はじめてのおこしですね。<br/>\n";
}
else{
   $_SESSION["count"] ++;
   print "{$_SESSION["count"]}回目のおこしですね。<br/>\n";
}
     
?>

</body>
</html>
