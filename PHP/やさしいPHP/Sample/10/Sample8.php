<?php setcookie("count", true); ?>

<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<h2>店内のご案内</h2>
<hr/>

<?php

if(!isset($_COOKIE["count"])){
   print "はじめてのおこしですね。<br/>\n";
}
else{
   print "毎度ありがとうございます。<br/>\n";
}

?>

</body>
</html>
