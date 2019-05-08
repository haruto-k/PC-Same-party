<?php 

$doc = new DOMDocument;

$root = $doc->createElement("products");
$doc->appendChild($root);

$elm1 = $doc->createElement("product");
$root->appendChild($elm1);

$elm11 = $doc->createElement("name");
$root->appendChild($elm11);

$elm12 = $doc->createElement("price");
$root->appendChild($elm12);

$txt11 = $doc->createTextNode("鉛筆");
$elm11->appendChild($txt11);

$txt12 = $doc->createTextNode("80");
$elm12->appendChild($txt12);

$elm2 = $doc->createElement("product");
$root->appendChild($elm2);

$elm21 = $doc->createElement("name");
$root->appendChild($elm21);

$elm22 = $doc->createElement("price");
$root->appendChild($elm22);

$txt21 = $doc->createTextNode("消しゴム");
$elm21->appendChild($txt21);

$txt22 = $doc->createTextNode("50");
$elm22->appendChild($txt22);

print $doc->saveXML();

?>
