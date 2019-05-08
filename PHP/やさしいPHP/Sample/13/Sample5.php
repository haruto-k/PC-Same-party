<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<form action="http://localhost/YPHPSample/13/Sample5.php" method="post">
<input type="text" name="url"/>
<input type="submit" value="送信"/>
</form>

<?php

if(isset($_POST["url"]))
{
   $doc = simplexml_load_file($_POST["url"]);

   print "<center>";
   print "<h1>". $doc->channel->title ."</h1>";
   print $doc->channel->description;
   print "<hr/>";
   print "</center>";

   foreach($doc->channel->item as $list){

      print "<p>";

      print "<h3>";

      print "<a href=\"";
      print $list->link;
      print "\">";
      print $list->title;
      print "</a>";

      print "</h3>";

      print $list->description ."<br/>";
      print $list->pubDate;

      print "</p>";
   }
}
?>

</body>
</html>
