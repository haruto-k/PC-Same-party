<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$num = 10;

print "1～{$num}までの偶数を出力します。<br/>\n";

for($i=1; $i<=$num; $i++){
   if(($i % 2) == 0)
      print "{$i}<br/>\n";
}

?>

</body>
</html>
