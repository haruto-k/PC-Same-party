<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<table border="2">

<?php

$word = array("a", "l", "g", "e", "b", "r", "a");

print "<tr><td>変換前</td><td>";

foreach($word as $value){
   print $value;
}

print "</td></tr>\n";

for($i=0; $i<count($word); $i++){
   if($word[$i] == "a")
      $word[$i] = "b";
}

print "<tr><td>変換後</td><td>";

foreach($word as $value){
   print $value;
}

print "</td></tr>\n";

?>

</table>

</body>
</html>
