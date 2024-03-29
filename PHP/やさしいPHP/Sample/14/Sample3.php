<!DOCTYPE html>
<html>
<head>
<title>サンプル</title>
</head>
<body>

<h2>商品のご選択</h2>

<form action="http://localhost/YPHPSample/14/Sample3.php" method="post">
<input type="text" name="product"/>
<input type="submit" value="送信"/>
</form>

<?php

try{
   if(isset($_POST["product"])){
      if($_POST["product"] == "")
         throw new NoInputException;
      elseif(strlen($_POST["product"])>10)
         throw new TooLongException;
      else
         print "「{$_POST["product"]}」をお買い上げいただきました。<br/>\n";
   }
}catch(NoInputException $e){
   print $e . "入力をお願いします。";
}catch(TooLongException $e){
   print $e . "正しい商品名をお願いします。";
}

class NoInputException extends Exception
{
   function __toString()
   {
      return  "商品名が入力されていません。";
   }
}

class TooLongException extends Exception
{
   function __toString()
   {
      return  "商品名が長すぎます。";
   }
}

?>

</body>
</html>
