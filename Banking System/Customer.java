import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * constructor Customer.
     * 
     * @param idNumber id number
     * @param fullName full name
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        accountList = new ArrayList<>();
    }

    public Customer() {
        accountList = new ArrayList<>();
    }

    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * return account of list.
     * 
     * @param account account
     */
    public void removeAccount(Account account) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).equals(account)) {
                accountList.remove(i);
            }
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
