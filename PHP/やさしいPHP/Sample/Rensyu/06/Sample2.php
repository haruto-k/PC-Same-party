<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$test = array(80, 60, 22, 50, 75);

$num = 0;

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>番号</th>
<th>点数</th>
</tr>

<?php

foreach ($test as $id => $value){
   if($value >= 70){
      $num++;
   }
   print "<tr><td>{$id}</td><td>{$value}</td></tr>\n";
}

?>

</table>

<?php


print "<br/>70点以上の学生は{$num}人です。<br/>\n";


?>

</body>
</html>
