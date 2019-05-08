<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$cr1 = new Car(1234, 25.5);
$cr2 = new Car(2345, 30.5);

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>ナンバー</th>
<th>ガソリン</th>
</tr>

<?php

print "<tr><td>";
print $cr1->getnumber();
print "</td> <td>";
print $cr1->getgas();
print "</td></tr>";

print "<tr><td>";
print $cr2->getnumber();
print "</td><td>";
print $cr2->getgas();
print "</td></tr>";

?>

</table>

<?php

class Car
{
   private $number = 0;
   private $gas = 0.0;

   public function __construct($nm, $gs)
   {
      $this->number = $nm;
      if($gs >= 0){
         $this->gas = $gs;
      }
   }
   public function getnumber(){return $this->number;}
   public function getgas(){return $this->gas;}
}

?>

</body>
</html>
