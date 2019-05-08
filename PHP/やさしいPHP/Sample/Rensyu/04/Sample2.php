<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$num1 = 10;
$num2 = 5;
   
print "\$num1は{$num1}\$num2は{$num2}です。<br/>\n";

if ($num1 < $num2) {
   print "{$num1}より{$num2}のほうが大きい値です。<br/>\n";
}
elseif($num1 > $num2) {
   print "{$num2}より{$num1}のほうが大きい値です。<br/>\n";
}
else{
   print "2つの数は同じ値です。<br/>\n";
}

?>

</body>
</html>
