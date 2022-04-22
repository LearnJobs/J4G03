import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Passbook_serialization {
public class PassbookSerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("PassbookObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Passbook> list = (List<Passbook>)ois.readObject();
			Passbook pb1 = list.get(0);
			Passbook pb2 = list.get(1);
			Passbook pb3 = list.get(2);
			Passbook pb4 = list.get(3);

			ois.close();
			fis.close();

			System.out.println(pb2.account_no);
			System.out.println(pb2.account_name);
			System.out.println(pb2.bank_name);
			System.out.println(pb2.ifs_code);

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
}
