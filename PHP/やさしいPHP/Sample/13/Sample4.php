<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<table border="2">

<?php

$doc = new DOMDocument;
$doc->load("Sample.rss");

$list = $doc->getElementsByTagName("item");

foreach($list as $node){
   print "<tr>";
   print "<td>". $node->nodeValue."</td>";
   print "</tr>";
}

?>

</table>

</body>
</html>
