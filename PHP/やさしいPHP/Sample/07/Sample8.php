<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

create_headline("商品納期のご案内", 1);

print "在庫があります場合は3営業日以内にお届けいたします。<br/>\n";
print "在庫がない場合は24時間以内に納期のご連絡をいたします。<br/>\n";

create_headline("商品送料のご案内", 2);

print "全国一律1000円にて発送いたしております。<br/>\n";

function create_headline($head, $num)
{
   print "<h$num>{$head}</h$num>";
   print "<hr/>";
}

?>

</body>
</html>
