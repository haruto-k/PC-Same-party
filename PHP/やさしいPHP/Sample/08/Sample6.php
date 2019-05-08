<?php include("MyClass.php"); ?>

<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php 

$usr1 = new User("鈴木", 56, "mmm@nnn.nn.jp", "03-xxx-xxxx");

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>名前</th>
<th>年齢</th>
<th>アドレス</th>
<th>電話</th>
</tr>

<?php

print "<tr><td>";
print $usr1->getname();
print "</td><td>";
print $usr1->getage();
print "</td><td>";
print $usr1->getadr();
print "</td><td>";
print $usr1->gettel();
print "</td></tr>";

?>

</table>

</body>
</html>
