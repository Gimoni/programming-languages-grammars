package 반복문;

public class ForStratement {

	public static void main(String[] args) {
		int[][] nums = {						// java 
				{ 1, 2, 3, 4, 5},
				{ 11, 12, 13, 14, 15},
				{ 21, 22, 23, 24, 25},
		};
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
//				System.out.print(nums[i][j] + ",");
				System.out.printf("%2d,", nums[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		// 향상된 for문
		for (int[] raw: nums) {
			for (int v: raw) {
//				System.out.println(v);
				System.out.printf("%2d,", v);
			}
			System.out.println();
		}
		
	}

}
