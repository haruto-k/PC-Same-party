<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

$data = array(
   array("8月1日", "東京に行きました"),
   array("8月2日", "今日は晴れでした"),
   array("8月5日", "明日から休暇です"), 
   array("8月7日", "帰省します"), 
   array("8月8日", "到着しました")
);

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>日付</th>
<th>タイトル</th>
</tr>

<?php

foreach ($data as $diary){
   print "<tr>";
   foreach ($diary as $value){
      print "<td>{$value}</td>";
   }
   print "</tr>\n";
}

?>

</table>

</body>
</html>
