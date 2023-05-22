<?php
$flexiple = array("Hire", "top", "freelance", "developers");
foreach ($flexiple as $value) {
echo "$value <br>";
}
$freelancer = array(
"name" => "Eric",
"email" => "Eric@gmail.com",
"age" => 22,
"gender" => "male"
);
foreach($freelancer as $key => $value) {
echo $key . ": " . $value . "<br>";
}
?>