<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>
<table border="2">

<?php

$c = 0;

for($i=1; $i<=10; $i++){
   if($c == 0){
      $c = 1;
      print "<tr bgcolor=\"#CCCCCC\">";
   }
   else{
      $c = 0;
      print "<tr>";
   }
   print "<td>商品{$i}を表示します。</td>";
}

print "</tr>\n";

?>

</table>

</body>
</html>
