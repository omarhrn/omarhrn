/**
 * 
 */

 function iconMenuEventClick(){
	if (document.getElementsByClassName("nav-menu")[0].hidden){
		document.getElementsByClassName("nav-menu")[0].hidden = !document.getElementsByClassName("nav-menu")[0].hidden;
		document.getElementsByClassName("nav-menu")[0].classList.remove("hidden");	
	}else{
		document.getElementsByClassName("nav-menu")[0].hidden = !document.getElementsByClassName("nav-menu")[0].hidden;
		document.getElementsByClassName("nav-menu")[0].classList.add("hidden");
	}
 }