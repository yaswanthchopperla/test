/**
 * 
 */
function show() {
	var res =" ";
	var obj= new Date();
	res += "Today's date " + obj.getDate() + "<br/>";
	var month=obj.getMonth();
	month=month+1;
	res += "Month is " +month + "<br/>";
	res += "Year is "+obj.getFullYear() + "<br/>";
	res += "Hours is "+obj.getHours()+ "<br/>";
	res += "Minutes is "+obj.getMinutes()+ "<br/>";
	res += "Seconds is "+obj.getSeconds()+ "<br/>";
	
	document.getElementById("res").innerHTML=res;
}
