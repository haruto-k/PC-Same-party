<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$pr1 = new Person("鈴木", 56);
$pr2 = new Person("佐藤", 38);

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

print "<hr/>";
print "合計人数：";
print Person::$count;

?>

<?php

class Person
{
   private $name = "姓名";
   private $age = 20;
   public static $count = 0; 

   public function __construct($nm, $ag)
   {
      Person::$count++;

      $this->name = $nm;
      if($ag>=20 && $ag<=60){
         $this->age = $ag;
       }
      else
        $this->age = -1;
   }
   public function getname(){return $this->name;}
   public function getage(){return $this->age;}
}

?>

</body>
</html>
