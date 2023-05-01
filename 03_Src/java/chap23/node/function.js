/**
 * 
 */
// 변수에 타입이 없고.. 값에 타입이 있당
/*let num = "Hello";
console.log(typeof num)
num = 100;
console.log(typeof num)*/

let num;	// 변수만 만들고 값을 할당하지 않은 상태
let num2 = null;

function xxx () {	// 함수만 만든 상태. 값이 없기 때문에  undefined 리턴. 
	
}

let rtn = xxx();
console.log("num = " + num);	// undifined;
console.log("num2 = " + num2);
console.log(rtn); 	// undefined : 값이 할당되지 않은 상태

// undefined는 null과는 유사하지만 다른 개념.  

if (num)	// 조건식을 사용했을 때 false로 인식. 
	console.log(".....");	
else
	console.log("*****");
	