/**
 * 
 */
var i=0
questions=[
           "1. What Is Object Oreinted Programming",
           "2. Who Introduced Java",
           "3. How To Declare Generics",
           "4. String.format() Is Used for",
          ];
function show() {
	document.getElementById("question").innerHTML=questions[i];
}
function nextQuestion() {
	i=i+1;
	if(i<4){
		show();
	} else {
		alert("**exam over**");
	}
}
           
           
       
