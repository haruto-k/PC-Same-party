<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$num = 0;

print "ようこそ。<br/>\n";
print "<hr/>\n";

if($num >  0){
   print "いらっしゃいませ。在庫があります。<br/>\n";
   print "在庫数は{$num}です。<br/>\n";
}
else{
   print "申し訳ありません。在庫切れです。<br/>\n";
}

print "<hr/>\n";
print "ごゆっくりお過ごしください。<br/>\n";

?>

</body>
</html>
