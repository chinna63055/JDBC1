package Demo;

public class Main {
	
//	private static 
	static int n=10;
	{
		++n;
	}
	{
		--n;
	}
	{
		++n;
	}
	public Main() {
		--n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Main n = new Main();
		int[] arr=new int[n];
		System.out.println(arr.length);

	}

}
