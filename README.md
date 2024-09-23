# PersonalManagmentSys
UML Diagram for classes used in a code. 
![image](https://github.com/user-attachments/assets/a04a6bd2-6fb4-443c-9c50-aa1d144b559c)
All classes grouped in package PAM, it is imported in main as package.
# Personal account have all required methods and variables:
+ accountNumber (int): A unique identifier for the account.
+ accountHolder (String): The name of the account holder.
+ balance (double): The current balance in the account.
+ transactions (an array of Amount objects): An array to store deposit and withdrawal transactions.
## Methods:
+Constructor:
PersonalAccount(int accountNumber, String accountHolder): Initializes the account with the given account number and account holder's name, setting the initial balance to 0.0.
Methods:
+ void deposit(double amount):
   Adds money to the account. This method creates an Amount object with a DEPOSIT type, records the transaction in the transactions array, and updates the balance accordingly.
+ void withdraw(double amount):
   Withdraws money from the account. This method creates an Amount object with a WITHDRAWAL type, logs the transaction in the transactions array, and updates the balance. It ensures that the withdrawal does not exceed the available balance.
+ void printTransactionHistory():
   Displays the transaction history by iterating through the transactions array and printing each transaction's type and amount.
+ double getBalance():
   Returns the current balance of the account.
+ int getAccountNumber():
   Returns the account number.
+ String getAccountHolder():
   Returns the name of the account holder.
## TransactionType Enum

Define an enum called **TransactionType** with the following constants:

- **DEPOSIT:** Indicates a deposit transaction.
  
- **WITHDRAWAL:** Indicates a withdrawal transaction.
### Amount Class

Create a Java class named **Amount** to represent a transaction amount. This class should include:

- **amount (double):** The amount involved in the transaction.

- **transactionType (TransactionType):** An enum value indicating the type of transaction, either DEPOSIT or WITHDRAWAL.

Current written main code demostrates usage of all function and variables.
