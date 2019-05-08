<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php 

$pr1 = new Person;
$pr1->name = "鈴木";
$pr1->age = 56;

$pr2 = new Person;
$pr2->name = "佐藤";
$pr2->age = 38;

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>名前</th>
<th>年齢</th>
</tr>

<?php

print "<tr><td>";
print $pr1->getname();
print "</td><td>";
print $pr1->getage();
print "</td></tr>";

print "<tr><td>";
print $pr2->getname();
print "</td><td>";
print $pr2->getage();
print "</td></tr>";

?>

</table>

<?php

class Person
{
   public $name ="姓名";
   public $age = 20;

   function getname(){return $this->name;}
   function getage(){return $this->age;}
}

?>

</body>
</html>
