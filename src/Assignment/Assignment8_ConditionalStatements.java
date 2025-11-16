package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStatements {

	public static void main(String[] args) {

		List<Integer> transaction = new ArrayList<Integer>();
		transaction.add(50000);
		transaction.add(-2000);
		transaction.add(3000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(4000);
		transaction.add(-3000);

		int totalcredit_count = 0;
		int totaldebit_count = 0;

		int totalcredit_Amount = 0;
		int totaldebit_Amount = 0;

		int totalSuspiciousCount = 0;

		for (int i = 0; i < transaction.size(); i++) {

			if (transaction.get(i) > 0) { // credit
				totalcredit_count++;
				totalcredit_Amount = totalcredit_Amount + transaction.get(i);

				if (transaction.get(i) > 10000) {
					System.out.println("Suspicious credit Transaction with Amount: " + transaction.get(i));
					totalSuspiciousCount++;
				}

			} else { // debit
				totaldebit_count++;
				totaldebit_Amount = totaldebit_Amount + transaction.get(i);

				if (transaction.get(i) > -10000) {
					System.out.println("Suspicious debit Transaction with Amount: " + transaction.get(i));
					totalSuspiciousCount++;
				}
			}

		} // for end
			// Print section start
			// 1 output
		System.out.println("Total Number of Credit Transactions:" + totalcredit_count);
		System.out.println("Total Number of Debit Transactions:" + totaldebit_count);

		// 2 output
		System.out.println("Total Credited Amount:" + totalcredit_Amount);
		System.out.println("Total Debited Amount:" + totaldebit_Amount);

		// 3 output
		System.out.println("Total Remaining Amount In Bank:" + (totalcredit_Amount + totaldebit_Amount));

		// 4 output
		System.out.println("Total number of suspicious transactions:" + totalSuspiciousCount);
		// Print section end

	}

}
