<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$test = 5;

print "成績は{$test}です。<br/>\n";

switch($test){
case 1:
   print "もっとがんばりましょう。<br/>\n";
   break;
case 2:
   print "もう少しがんばりましょう。<br/>\n";
   break;
case 3:
   print "さらに上をめざしましょう。<br/>\n";
   break;
case 4:
   print "たいへんよくできました。<br/>\n";
   break;
case 5:
   print "たいへん優秀です。<br/>\n";
   break;
}

?>

</body>
</html>
