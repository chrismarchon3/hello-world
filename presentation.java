

public class WriteCustomerlist{

    int idNumber;
    String firstName;
    String lastName;
    double balance;

    public Customer(int idNumber, String firstName, String lastName,
                    double balance) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }


    public String toString() {
        return idNumber + "," + firstName + "," + lastName + "," + balance;
    }

}

***************************************************



        import java.io.BufferedWriter;
        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.Scanner;

        public class CustomerTest {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer=new BufferedWriter(new FileWriter(new File("D:/customer.txt")));
        for(int i=0;i<5;i++)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter customer id number");
            int id=scanner.nextInt();
            System.out.println("enter customer fname");
            String fname=scanner.next();
            System.out.println("enter customer lname");
            String lname=scanner.next();
            System.out.println("enter the balance");
            double bal=scanner.nextDouble();
            Customer c=new Customer(id,fname,lname,bal);
            writer.write(c.toString());
            writer.flush();
            writer.newLine();


        }

    }

}

**************************************************************************************************


        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.Scanner;

public class DisplaySelectedCustomer {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter customer id to search");
        int cid = scanner.nextInt();

        BufferedReader reader = new BufferedReader(new FileReader(new File(
                "D:/customer.txt")));

        String line = null;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(",");
            if (cid == (Integer.parseInt(words[0]))) {
                System.out.println(line);
            }

        }

    }

}

******************************************************************


        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;

public class SavedCustomerList {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new FileReader(new File("D:/customer.txt")));

        String line=null;

        while((line=reader.readLine())!=null)
        {
            System.out.println(line);
        }

    }

}

************************************************************************************************************



        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.Scanner;

public class DisplaySelectedCustomerByname {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter customer last name to search");
        String lname = scanner.next();

        BufferedReader reader = new BufferedReader(new FileReader(new File(
                "D:/customer.txt")));

        String line = null;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(",");
            if (lname.equals((words[2]))) {
                System.out.println(line);
            }

        }

    }

}