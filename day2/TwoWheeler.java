package week1.day2;

public class TwoWheeler {
	public static final char[] noOfWheels = null;
	public static final String noOfMirrors = null;
	public static final String chassisNumber = null;
	public static final String isPunctured = null;
	public static final String bikeName = null;
	public static final String runningKM = null;

	public class Twowheeler {
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=1234567898345672L;
		boolean isPunctured=false;
		String bikeName="Ktm";
		double runningKM=298734.87634;

		public static void main(String[] args) {
			TwoWheeler two=new TwoWheeler();

			System.out.println(two.noOfWheels);
			System.out.println("noOfMirrors "+two.noOfMirrors);
			System.out.println("chassisNumber "+two.chassisNumber);
			System.out.println("isPunctured "+two.isPunctured);
			System.out.println("bikeName "+two.bikeName);
			System.out.println("runningKM "+two.runningKM);
		}
}


}