import java.io.*;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 22:55
 * @Auther:ShiShc
 */
class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    Employee(){}

    Employee(String n, String add, int ssn, int num) {
        this.name = n;
        this.address = add;
        this.SSN = ssn;
        this.number = num;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

/**
 *
 * 请注意，一个类的对象要想序列化成功，必须满足两个条件：
 * 该类必须实现 java.io.Serializable 接口。
 * 该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 *
 * 如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
 *
 * 注意： 当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。
 *
 * 注意，readObject() 方法的返回值被转化成 Employee 引用。
 * 当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，该值没有被发送到输出流。所以反序列化后 Employee 对象的 SSN 属性为 0。
 * 对于 JVM 可以反序列化对象，它必须是能够找到字节码的类。如果JVM在反序列化对象的过程中找不到该类，则抛出一个 ClassNotFoundException 异常。
 */


public class MySerializable {
    public static void main(String[] args) {
        Employee employee = new Employee("Shi", "Xian", 11122333, 110);

        try {
            FileOutputStream os = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(employee);
            oos.close();
            os.close();
            System.out.println("Saved in /employee.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Employee result = new Employee();
        try {
            FileInputStream is = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(is);
            result = (Employee) ois.readObject();

            ois.close();
            is.close();
        } catch(IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + result.name);
        System.out.println("Address: " + result.address);
        System.out.println("SSN: " + result.SSN);
        System.out.println("Number: " + result.number);

    }
}
