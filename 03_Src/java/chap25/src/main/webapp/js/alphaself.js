/**
 * 
 */
/**
 * 
 */

/*window.onload = function(e) {
	console.log("onload..." + e.type);
}*/

// class 

class Alpha {
	constructor() {
		window.addEventListener("load", this);
		
	}
	
	handleEvent(e) {
		console.log("handleEvent..." + e.type);
		this[e.type](e);
	}	
	
	load(e) {	// 나 자신을 불러옴. 
		document.forms.alpha.addEventListener("submit", this);	
	}
	submit(e) {
		e.preventDefault();
		
		let line = document.forms.alpha.line.value;
		let column = document.forms.alpha.column.value;
		let fg = document.forms.alpha.fg.value;
		let bg = document.forms.alpha.bg.value;
		let ch = document.forms.alpha.ch.value;
		
		console.log(`[${line}, ${column}, ${bg}, ${bg}, ${ch}]`)
		
		/*ol.innerText ="";*/
	}
	
}

new Alpha();