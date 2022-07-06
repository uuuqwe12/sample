
public class k1 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*50);
		}
		int max = 0;
		for(int e: num) {
			System.out.println(e);
			if(max<e) {
				max=e;
			}
		}
		System.out.println("제일 큰 값: "+max);
		
	}

}
