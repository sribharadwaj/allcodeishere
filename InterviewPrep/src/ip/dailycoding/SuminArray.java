package ip.dailycoding;

public class SuminArray {
public static void main(String[] args) {
	System.out.println(sumInArray());
}
	public static boolean sumInArray() {
		// TODO Auto-generated method stub
		int[] inNumbers = {10,5,15,7};
		
		int number = 15;
		
		/*
		 * int sum =Arrays.stream(inNumbers) .reduce(0,(a,b)-> a+b);
		 */
		
		for(int i=0;i<=inNumbers.length;i++) {
			for(int j=i+1;j<inNumbers.length;j++) {
				System.out.println(i+" "+j);
				int sumNum = inNumbers[i]+inNumbers[j];
				if(sumNum==number) {
					return true;
				}
			}
		}
		return false;
	}

}
