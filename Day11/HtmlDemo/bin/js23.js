/**
 * 
 */
function strDemo() {
	var res = "";
	var str = "Welcome To HTML Programming ..by Prasanna"+ "<br/><br/>";
	var len = str.length;
	res += "Lenght is "+len + "<br/>";
	res += "lower-case string is <b> "+ str.toLowerCase();
	+ "<br/><br/>";
	res += "Upper-case string is <b> "+ str.toUpperCase();
	+ "<br/><br/>";
	res += "First occurence of 'a' is <b>" + str.indexOf("a")+"<br/><br/>";
	res += "char at 5th position is <b>" +str.charAt(5)+ "<br/><br/>";
	res += "replaced string is <b>" + str.replace("HTML", "HTML 5") + "<br/><br/>";
	 
	document.getElementById("res").innerHTML = res;
	
	
}