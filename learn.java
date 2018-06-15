<html>
<body>
<input type="text" onblur="test()" id="isim" placeholder="Araba Markası">
<div id="output">
	
</div>

<script type="text/javascript">

let source = new Date();
let hour = source.getHours();
let minute = source.getMinutes();
let second = source.getSeconds();

let x = Number.isInteger(-5);

document.getElementById("output").innerHTML = "<hr>"+hour+":"+minute+":"+second+"<hr>"+x

</script>

</body>
</html>

-------------------------------------------------------------------------------------

let source = new Date();
let hour = source.getHours();
let minute = source.getMinutes();
let second = source.getSeconds();

-------------------------------------------------------------------------------------


