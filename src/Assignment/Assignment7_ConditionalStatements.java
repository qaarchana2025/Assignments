package Assignment;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {

		int creditscore = 720;
		String customerName = "John Doe";
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		System.out.println("Loan application for the given customer:" + customerName);

		if (creditscore > 750)// credit score
		{
			System.out.println("Loan is approved.");

		} else if (creditscore >= 650 && creditscore <= 750) {
			if (income >= 50000) {
				if (isEmployed) {
					if (debtToIncomeRatio < 40) {
						System.out.println("Loan is approved");
					} else {
						System.out.println("Loan is denied as high Debt-to-Income Ratio.");
					}

				} else {
					System.out.println("Loan Denied as Applicant is unemployed.");
				}
			} else {
				System.out.println("Loan denied as Insufficient Income.");
			}

		} else {

			System.out.println("Loan denied as Loow credit score.");

		}
	}
}
