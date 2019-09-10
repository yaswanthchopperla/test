/**
 * 
 */
function show() {
	var fn, ln;
	fn = frmNameform.firstname.value;
	ln = frmNameform.lastname.value;
	frmNameform.fullname.value= fn + " " +ln;
}