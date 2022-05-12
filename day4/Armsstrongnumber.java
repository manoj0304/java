package week1.day4;

public class Armsstrongnumber {
		public static void main(String[] args) {
			int input = 153,sum=0,rem;
			int orgnum = input;
			 while (orgnum>0) 
			 {
	           rem = orgnum%10;
			   sum = sum+rem*rem*rem;
			   orgnum = orgnum/10;
			}
			 if(sum == input) {
			   System.out.println("its armsstrong number");
		}
		else {
			System.out.println("its not armsstrong number");

	}
		}

	}

