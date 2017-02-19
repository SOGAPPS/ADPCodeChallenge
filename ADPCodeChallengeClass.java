<!DOCTYPE html>
<html>
<body>

<p id="demo"></p>

<script>
var numb = [1,2,3,4,5,6,7,8,9,10,100,112,113];
        var evenNumbers = [];
        var i;
        var l = numb.length;

        for (i = 0; i < l; i++) {

        if (numb[i] % 2 == 0)
        {
        evenNumbers += numb[i] + "<br>";

        document.getElementById("demo").innerHTML = evenNumbers;
        }

        }

</script>

</body>
</html>
