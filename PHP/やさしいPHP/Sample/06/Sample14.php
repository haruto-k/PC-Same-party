<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$city1 = array("東京", "大阪", "京都");
$city2 = array("神戸", "名古屋", "福岡");

$world = array_merge($city1, $city2);

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>番号</th>
<th>都市名</th>
</tr>

<?php

foreach($world as $id => $value){
   print "<tr><td>{$id}</td><td>{$value}</td></tr>\n";
}

?>

</table>

</body>
</html>
