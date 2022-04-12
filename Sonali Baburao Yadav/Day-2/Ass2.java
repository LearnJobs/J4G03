package day2;

public class Ass2 {

	public Ass2(int start,int end) {
		for(int i=1;i<=10;i++) {
			for(int j=start;j<=end;j++) {
				System.out.print(padLeft(j,2)+"x"+padLeft(i,2)+"="+padLeft(i*j,3)+" ");
			}
			System.out.println();
			}}
		String padLeft(int number,int length) {
			StringBuffer buf=new StringBuffer(String.valueOf(number));
			for(int i=buf.length();i<length;i++) {
				buf.insert(0, " ");
			}
			return buf.toString();
			
		
	}
	public static void main(String[] args) {
		new Ass2(15,20);

	}

}
