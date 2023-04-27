
// 객체 리터럴 생성
let job = {
	// then method 	
	then : function(resolve, reject) {
		console.log("then...")
		setTimeout(resolve, 2000);
	}
}

// 비동기 처리 
async function main() {
	await job;	// job 수행을 기다림 / timeout 2sec
	console.log("job1 end..")
	
	await job;
	console.log("job2 end..")
	
	await job;
	console.log("main() End...")
}

main();
console.log("End...")

