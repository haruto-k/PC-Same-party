<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<table border="2">

<?php

$fp = fopen("Sample.csv", "r");
while(($str = fgetcsv($fp)) != null){
   if(is_array($str)){
      print "<tr>";
      foreach($str as $value){
         print "<td>{$value}</td>";
      }
   }
   print "</tr>\n";
}

fclose($fp);

?>

</table>

</body>
</html>
