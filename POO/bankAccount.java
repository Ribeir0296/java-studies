class BankAccount {
    // TODO: add a private int field called balance (it starts at 0)

    // TODO: add money and return true, or return false if amount is zero or negative
    boolean deposit(int amount) {
        return false;
    }

    // TODO: take money out and return true, or return false if there is not enough money
    boolean withdraw(int amount) {
        return false;
    }

    // TODO: return the current balance
    int getBalance() {
        return 0;
    }
}

void main() {
    BankAccount account = new BankAccount();
    int n = Integer.parseInt(IO.readln().trim());
    for (int i = 0; i < n; i++) {
        String[] parts = IO.readln().trim().split(" ");
        String command = parts[0];
        if (command.equals("balance")) {
            IO.println("Balance: " + account.getBalance());
            continue;
        }
        int amount = Integer.parseInt(parts[1]);
        if (command.equals("deposit")) {
            IO.println(account.deposit(amount) ? "Deposited " + amount : "Invalid amount");
        } else if (amount <= 0) {
            IO.println("Invalid amount");
        } else if (account.withdraw(amount)) {
            IO.println("Withdrew " + amount);
        } else {
            IO.println("Insufficient funds");
        }
    }
}
