<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$test = array(80, 60, 22, 50, 75);

$max = 0;

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>番号</th>
<th>点数</th>
</tr>

<?php

foreach ($test as $id => $value){
   if($max < $test[$id])
      $max = $test[$id];

   print "<tr><td>{$id}</td><td>{$value}</td></tr>\n";
}

?>

</table>

<?php


print "<br/>最高点は{$max}です。<br/>\n";


?>

</body>
</html>
