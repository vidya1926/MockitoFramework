package week2.day1;

public class LearnBreak {

	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			if(i==8) {
				System.out.println("Stop the execution");
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Learning Break");
		

	}

}
