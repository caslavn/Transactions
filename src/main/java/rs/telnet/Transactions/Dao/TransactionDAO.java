package rs.telnet.Transactions.Dao;

import rs.telnet.Transactions.Model.Transaction;
import java.util.List;

public interface TransactionDAO {

    List<Transaction> getAllTransactions();

    Transaction findTransactionById(int theId);

    Transaction saveTransaction(Transaction theTransaction);

    void deleteTransactionById(int theId);

}
