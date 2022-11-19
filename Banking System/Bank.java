import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<Customer>();  
    
    public Bank() {
        customerList = new ArrayList<Customer>();
    }

    /**
     * read customer data from file.
     * 
     * @param in input stream
     */
    public void readCustomerList(InputStream in) {
        // read customer list from input stream
        // and add them to customerList
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                if (line.charAt(0) >= 'A' && line.charAt(0) <= 'Z') {
                    long idNumber = Long.parseLong(line.substring(line.length() - 9));
                    String fullName = line.substring(0, line.length() - 10);
                    Customer customer = new Customer(idNumber, fullName);
                    customerList.add(customer);
                } else if (line.charAt(0) >= '0' && line.charAt(0) <= '9') {
                    long accountNumber = Long.parseLong(line.substring(0, 10));
                    if (line.charAt(11) == 'C') {
                        double balance = Double.parseDouble(line.substring(20));
                        CheckingAccount account = new CheckingAccount(accountNumber, balance);
                        customerList.get(customerList.size() - 1).addAccount(account);
                    } else if (line.charAt(11) == 'S') {
                        double balance = Double.parseDouble(line.substring(19));
                        SavingsAccount account = new SavingsAccount(accountNumber, balance);
                        customerList.get(customerList.size() - 1).addAccount(account);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * get customer list.
     * 
     * @return customer list
     */
    public String getCustomersInfoByNameOrder() {
        // return customer list by name order sort
        List<Customer> list = new ArrayList<Customer>(customerList);
        list.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).getCustomerInfo();
            result += "\n";
        }
        return result.trim();
    }

    /**
     * get customer list.
     * 
     * @return customer list
     */
    public String getCustomersInfoByIdOrder() {
        // return customer list in account number order
        List<Customer> list = new ArrayList<Customer>(customerList);
        list.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o1.getIdNumber() - o2.getIdNumber());
            }
        });
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).getCustomerInfo();
            result += "\n";
        }
        return result.trim();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
