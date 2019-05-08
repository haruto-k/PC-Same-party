<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>
<table border="2">

<?php

for($i=1; $i<=9; $i++){
   print"<tr>";
   for($j=1; $j<=9; $j++){
      print "<td>". $i*$j."</td>";
   }
}
   print"</tr>\n";
?>

</table>

</body>
</html>
