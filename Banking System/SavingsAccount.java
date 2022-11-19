public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(new InsufficientFundsException(amount).getMessage());
        } else if (amount > 1000 || balance - amount < 5000) {
            System.out.println(new InvalidFundingAmountException(amount).getMessage());
        } else {
            try {
                doWithdrawing(amount);
                Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, 
                            amount, balance + amount, balance);
                this.addTransaction(transaction);
            } catch (BankException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, 
                            amount, balance - amount, balance);
            this.addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
