package day4;

import java.rmi.NotBoundException;

public class User_define_Exception {

	public static void main(String[] args) throws NotBoundException {
		try {System.out.println("User Defined Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
		}catch(StringIndexOutOfBoundsException e) {
		}catch(MyException e) {
		}
	}
}
class MyException extends RuntimeException{
}