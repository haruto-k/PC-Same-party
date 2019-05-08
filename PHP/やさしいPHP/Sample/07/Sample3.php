<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php 

buy("鉛筆");
buy("消しゴム");

function buy($pr)
{
   print "<hr/>\n";
   print "商品「{$pr}」をお買い上げいただきました。<br/>\n";
   print "<hr/>\n";
}

?>

</body>
</html>
