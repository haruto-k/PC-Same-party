<?php

<!DOCTYPE html>

<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php 

//このコードは動作しません。
//誤りをみつけて修正してください。（正解はLesson6 Sample8.php）


$city = array("東京", "名古屋", "京都", "大阪", "福岡);

array_push($city, "長崎", "鹿児島");
array_pop(city);
array_unshift($city, "札幌" "仙台");
array_shift($city);
unset($city[10]);

?>

<table border="2">
<tr bgcolor="#AAAAAA">
<th>番号</th>
<th>都市名</th>
</tr>

<?php

forreach($city as $id => $value){
   print "<tr><td>{$id}</td><td>{$value}</td></tr>\n"
}

?>

</body>
</html>
