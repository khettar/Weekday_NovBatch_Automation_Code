package java_code_pattern_assignment;

public class Pattern2_Assignment {
  
	public static void main(String[] args) {
		
		int n =5;
		
		for (int i =n; i>=1;i--) {
			
			for(int k=n-i; k>0; k--) {
				
		System.out.print("  ");	
			}
			for(int	j=i; j>0 ;j--) {
			
			System.out.print("* ");
		}
		
          System.out.println();
	}

}
}