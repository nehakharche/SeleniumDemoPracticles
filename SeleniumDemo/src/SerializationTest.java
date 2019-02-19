import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Neha
 *
 */
public class SerializationTest {
	// deserialize to Object from given file
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}

	// serialize the given object and save it to file
	public static void serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String str_SerFileName = "Employee.txt";
		Employee emp = new Employee("Neha", 13012364);
		Employee empObject = new Employee();
		SerializationTest.serialize(emp, str_SerFileName);
		empObject = (Employee) SerializationTest.deserialize(str_SerFileName);
		System.out.println(empObject);

	}
}
class Employee implements Serializable {
	String str_Name;
	transient int int_Eid;
	public Employee() {
		super();
	}
	public Employee(String str_Name, int int_Eid) {
		super();
		this.str_Name = str_Name;
		this.int_Eid = int_Eid;
	}
	@Override
	public String toString() {
		return "Employee [str_Name=" + str_Name + ", int_Eid=" + int_Eid + "]";
	}
	public String getStr_Name() {
		return str_Name;
	}
	public void setStr_Name(String str_Name) {
		this.str_Name = str_Name;
	}

	public int getInt_Eid() {
		return int_Eid;
	}

	public void setInt_Eid(int int_Eid) {
		this.int_Eid = int_Eid;
	}
}
