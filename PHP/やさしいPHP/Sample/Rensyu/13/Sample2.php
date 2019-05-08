<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>タイトル</th>
<th>解説</th>
<th>日付</th>
</tr>

<?php 

$doc = simplexml_load_file("Sample.rss");

foreach($doc->channel->item as $list){

   print "<tr>";

   print "<td>";
   print "<a href=\"";
   print $list->link;
   print "\">";
   print $list->title;
   print "</a>";
   print "</td>";

   print "<td>". $list->description ."</td>";
   print "<td>". $list->pubDate ."</td>";

   print "</tr>";
}

?>

</table>

</body>
</html>
