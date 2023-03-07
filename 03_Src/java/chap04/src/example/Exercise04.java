package example;

public class Exercise04 {
	 /*
	  * 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
			 100 이상이 되는 지 구하시오.
	  */
	
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		
		do {
			i++;
			sum = sum + (i%2==0 ? -i : i);
		}while(sum<100);
		
		System.out.println("result = " + i + "이다.");
	}
	
	
	public static void main4(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum<100) {
			i++;
			sum += i%2==0 ? -i : i;
		}
		
		System.out.println("result는 " + i + "이다.");
		 
	}
	
	public static void main3(String[] args) {
		
		int sum = 0;
		
		int result = 0;
		for (int i=0; i<Integer.MAX_VALUE; i++) {
			sum += i%2==0 ? -i : i;
//			sum = sum + (i%2==0 ? -i : i);		// 우선순위
			if (sum>=100) {
				result = i;
				break;
			}
		}
		System.out.println("result = " + result);
	}
	
	
	public static void main2(String[] args) {
		int sum = 0;
		int num = 0;
		
		while(sum<100) { 		// sum의 (총합이) 100보다 작은 값을 구할때 
			++num;				// num이 증가하고
			if(num%2==0) 
				sum-=num;		// num은 2의 배수일때 (2의 배수로 증가) : sum-num=sum 이 참이거나  
			 else 
				sum+=num;				// 거짓인 sum+num = sum; 일때 
			
		}
		System.out.println(num+"일 때, 총합이 " + sum + " 이 된다.");
	}

}
