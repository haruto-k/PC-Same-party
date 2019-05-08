<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>
<?php

$product = "消しゴム";
$num = 10;
$price = 50;

$total = $price * $num;
$total = $total - 100;

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>内容</th>
<th>金額</th>
</tr>

<?php

print "<tr><td>品名</td><td>{$product}</td></tr>\n";
print "<tr><td>単価</td><td>{$price}円</td></tr>\n";
print "<tr><td>個数</td><td>{$num}個</td></tr>\n";
print "<tr><td>計</td><td>{$total}円(但100円引)</td></tr>\n";

?>

</table>

</body>
</html>
