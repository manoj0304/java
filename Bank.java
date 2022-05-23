
	package week4.day1;

	public class Bank extends SBI implements PNB,CIBIL {

		public void cibilScore() {
			System.out.println("CIBIL Score: 1000pts");		
		}

		public void maximumLoanAmount() {
			System.out.println("Max Loan Amount : 1500000INR");
		}

		public void creditScore() {
			System.out.println("CreditScore : 5000pts");
		}

		public void minimumBalance() {
			System.out.println("Min Balance : 35000INR");
		}

		@Override
		void bankBalance() {
			System.out.println("Bank Balance : 314378INR");
		}

		public static void main(String[] args) {
			Bank obj = new Bank();
			obj.bankBalance();
			obj.cibilScore();
			obj.creditScore();
			obj.maximumLoanAmount();
			obj.minimumBalance();
			obj.ITLoan(); 
		
		}
		
	}

