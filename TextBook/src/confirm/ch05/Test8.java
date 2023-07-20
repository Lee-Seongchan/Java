package confirm.ch05;

public class Test8 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;		
		int count = 0;
		
		
		int[][]array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
//		for(int[] arr1 : array) {
//			for(int arr2 : arr1) {
//				System.out.printf("%d ",arr2);
//				sum += arr2;
//				count++;
//				avg = sum / count;
//			}
//		
//		}
		
		
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
	}

}
