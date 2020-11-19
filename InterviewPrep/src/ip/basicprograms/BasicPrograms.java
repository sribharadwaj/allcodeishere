package ip.basicprograms;

public class BasicPrograms {

	static int i[]= {0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {1};
		//change_i(i);
		//floatNums();
		//prePostFixes();
		loopWithPrePostFixes();
		//System.out.println(i[0]);
	}
	public void main(int[] j) {
		i=j;
		System.out.println(i[0]);
	}
	
	public static void change_i(int[] i) {
		int j[] = {2};
		i=j;
		BasicPrograms bp = new BasicPrograms();
		bp.main(j);
	}
	
	public static void floatNums() {
		float f = 2.3f;
		double d = 2.7d;
		System.out.println(Math.ceil(f));
		System.out.println(Math.round(f));
		System.out.println(Math.floor(f));
		System.out.println(Math.abs(f));
		System.out.println("\n");
		System.out.println(Math.ceil(d));
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.abs(d));
		int i=((int)Math.ceil(f))*((int)Math.round(d));
		//System.out.println(i);
		
	}
	
	public static void prePostFixes() {
		
		int i =0;
		int j=0;
		
		System.out.println("i++ : "+ i++);
		System.out.println(i);
		j=++i;
		System.out.println("++i : "+ j);
		j=i++;
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void loopWithPrePostFixes() {
		int i=0,j=2;
		do {
			i=++i;
			j--;
		}while(j<2);
			System.out.println(i);
	}
}
