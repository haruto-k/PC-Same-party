<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<?php

print __FILE__;
print "<hr/>\n";

print "現在" . __LINE__ ."行目..."; 
funcA();
print "現在" . __LINE__ ."行目..."; 
funcB();
print "現在" . __LINE__ ."行目..."; 
funcA();

function funcA()
{
   print "<hr/>\n";
   print __FUNCTION__;
   print "<hr/>\n";
}
function funcB()
{
   print "<hr/>\n";
   print __FUNCTION__;
   print "<hr/>\n";
}

?>

</body>
</html>
