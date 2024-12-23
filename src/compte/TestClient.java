package compte;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import Bank.Transaction;
import Bank.TransactionHelper;

public class TestClient {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            String[] myargs = { "-ORBInitialHost", "192.168.1.13", "-ORBInitialPort", "1050" };

            Properties props = System.getProperties();
            ORB orb = ORB.init(myargs, props);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Assuming 'Transaction' is the interface, adjust it based on your implementation
            String name = "TRANSACTION";
            Transaction transaction = TransactionHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Enter Counter ID:");
            String counterId = in.readLine();
            System.out.println("Enter the account ID:");
            String accountId = in.readLine();
            System.out.println("Enter debit amount:");
            double debit = Double.parseDouble(in.readLine());
            System.out.println("Enter Credit amount");
            double credit = Double.parseDouble(in.readLine());
            System.out.println("Enter date of transaction");
            String date = in.readLine();

            // Perform the transaction
            String status = transaction.updateDetails(counterId, date, debit, credit, accountId);
            System.out.println("Status of operation: " + status);

            // Close the ORB connection
            orb.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
