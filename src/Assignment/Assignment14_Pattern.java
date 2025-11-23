package Assignment;

public class Assignment14_Pattern {

	public static void main(String[] args) {
		
		int n=5;
		for(int i = 1; i <= n; i++) {
            for(int l = 1; l <= n - i; l++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}

}
