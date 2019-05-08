<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$product = array("鉛筆", "消しゴム", "定規", "コンパス", "ボールペン");

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>商品名</th>
</tr>

<?php

print "<tr><td>" . current($product) . "</td></tr>";
next($product);
print "<tr><td>" . current($product) . "</td></tr>";
next($product);
print "<tr><td>" . current($product) . "</td></tr>";
prev($product);
print "<tr><td>" . current($product) . "</td></tr>";
reset($product);
print "<tr><td>" . current($product) . "</td></tr>";

?>

</table>

</body>
</html>
