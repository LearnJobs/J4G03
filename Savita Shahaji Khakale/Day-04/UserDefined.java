package Day4;
public class UserDefined{

	public static void main(String[] args) {
		try {
			System.out.println("User Defined Exception");
		} catch(ArrayIndexOutOfBoundsException e) {
		} catch(StringIndexOutOfBoundsException e) {
		} catch(IndexOutOfBoundsException e) {
		} catch(NumberFormatException e) {
		} catch(MyException e) {
		}
	}

}

class MyException extends RuntimeException {
	
}