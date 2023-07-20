package confirm.ch04;

public class Test2 {
	public static void main(String[] args) {
			{
				String grade = "B";
				int score = 0;
				
				switch (grade) {
				case "A":
					score = 100;
					break;
				case "B" : 
					int result = 100 - 20;
					break;
				default:
					score = 60;
			}
	
				
			{
				String grade1 = "B";
				int score1 = 0;
				int result1 = 0;
				
				if(grade1 == "A") {
					result1 = 100;
				}else if(grade1 == "B"){
					result1 = 100 - 20;
					
				}else {
					score1 = 60;
				}
				System.out.println(result1);
				
				
				
				
			}
				
				
		}
		
	}
}
