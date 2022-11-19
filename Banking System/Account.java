import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {
        transactionList = new ArrayList<>();
    }

    /**
     * constructor Account.
     * 
     * @param accountNumber account number
     * @param balance balance
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionList = new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * draw money.
     * 
     * @param amount amount
     * @throws BankException BankException
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (balance - amount < 0) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }
    }

    /**
     * deposit money.
     * 
     * @param amount amount
     * @throws BankException BankException
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * get Transaction list.
     * 
     * @return Transaction list
     */
    public String getTransactionHistory() {
        StringBuffer sb = new StringBuffer();
        sb.append("Lịch sử giao dịch của tài khoản " + accountNumber + ":\n");
        for (int i = 0; i < transactionList.size(); i++) {
            sb.append("- " + transactionList.get(i).getTransactionSummary() + "\n");
        }
        return sb.toString();
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account account = (Account) obj;
            return accountNumber == account.accountNumber;
        }
        return false;
    }
}