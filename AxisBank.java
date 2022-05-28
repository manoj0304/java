package week4.day3;

public class AxisBank extends BankInfo {
   public void deposit() {
	   System.out.println("Fixed deposit");
   }
   public static void main(String[] args) {
	AxisBank axi = new AxisBank();
	axi.saving();
	axi.fixed();
	axi.deposit();
}
}
