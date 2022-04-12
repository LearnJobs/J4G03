
public class Count_Vowel {

	public static void main(String[] args) {
		String text="we arevlearningjava learnjobs by the code nation";
		char[] vowel= {'A','E','I','O','U','a','e','i','o','u'};
		char c;
		int count=0;
		for(int i=0; i<text.length();i++) {
			c=text.charAt(i);
			for(int j=0;j<vowel.length;j++) {
				if(c==vowel[j]) {
					count++;
				}
			}
		}
System.out.println("totalvowels="+count);
	}



	}


