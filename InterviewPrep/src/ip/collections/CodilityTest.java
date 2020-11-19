package ip.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution();
		//sumofNumbers_double(); //Done
		pairingNumbers();
		
	}

	public static void solution() {
		int[] A = {1,5,1,4,1};
		List<Integer> numbers = IntStream.of( A ).boxed().collect( Collectors.toList() );
		
		int num = (int) numbers.stream()
				//.map(e->new Integer((int)e))
				.filter(e->(Integer)e==1)
				.count();
				System.out.println(num);
	}
	
	
	public static void pairingNumbers() {
		
		int number = 15;
		
		int[] result = new int [2];
		
		//int div =checkRemainder(number,2);
		
		int val = number/2;
		result[0] = val;
		boolean pairFound = false;
		boolean isEven = checkRemainder(number,2)==0;
		do {
			if(isEven) {
				if(!hasZero(val)) {
					result[0]=result[1]=val;
					pairFound = true;
				}else {
					val=val+1;
				}
			}else {
				if(!hasZero(val) && !hasZero(val+1)) {
					result[0] =val;
					result[1] = val+1;
					pairFound = true;
				}else 
				{
					val=val+1;
				}
			}
		}while(!pairFound);
		
		
		System.out.println(result[0]+" "+result[1]);
		
	}
	
	private static boolean hasZero(int num) {
		
		int rem = checkRemainder(num,10);
		do {
			//num= num///
		}while(num>0 && num<10);
		return false;
	}
	
	private static int checkRemainder(int num,int divisor) {
		return num%divisor;
	}
	
	public static void sumofNumbers_double() {
		
		int number = 500;
		int sum = sumofNumbers(number,0)*2;
		int sumofMinNum =0;
		do {
			sumofMinNum= sumofNumbers(++number,0);
		}while(sum!=sumofMinNum);
		
		System.out.println(number);
		
	}
	public static int sumofNumbers(int i,int sum) {
		
		if(i<10) {
			sum+=i;
		}else {
			
			sum+=i%10; //4
			i=i/10;//10
			 sum = sumofNumbers(i,sum);
		}
		return sum;
	}
}
