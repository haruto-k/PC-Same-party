<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$product = "鉛筆";
$price = 50;

buy($product, $price);

//buy関数の定義
function buy($pr, $pc)
{
   print "<hr/>\n";
   print "商品「{$pr}」を{$pc}円でお買い上げいただきました。<br/>\n";
   print "<hr/>\n";
}

?>

</body>
</html>
