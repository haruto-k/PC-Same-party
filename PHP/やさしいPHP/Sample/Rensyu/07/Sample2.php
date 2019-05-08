<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php 

$num = 5;

$ans = square($num);

print "{$num}の2乗は{$ans}です。<br/>\n";

function square($x)
{
   return $x * $x;
}

?>

</body>
</html>
