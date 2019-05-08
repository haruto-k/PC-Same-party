<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$product = "鉛筆";
$price = 50;
$num = 10;

$total = buy($product, $price, $num);

print "合計{$total}円です。<br/>\n";

function buy($pr, $pc, $nm)
{
   print "<hr/>\n";

   print "商品「{$pr}」を{$pc}円で{$nm}個お買い上げいただきました。<br/>\n";

   $tt = $pc * $nm;

   print "<hr/>\n";    
 
  return $tt;
}

?>

</body>
</html>
