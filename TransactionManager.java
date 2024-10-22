import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionManager {

    // This method starts a new transaction.
    @Transactional
    public void begin() {
        // Logic to begin a transaction. This is typically handled by the Spring framework.
        // You could use platform-specific transaction management here if needed.
        System.out.println("Transaction started");
    }

    // This method commits the current transaction.
    @Transactional
    public void commit() {
        // Logic to commit the transaction. In Spring, this is done automatically if no exceptions occur.
        System.out.println("Transaction committed");
    }

    // This method rolls back the current transaction.
    @Transactional
    public void rollback() {
        // Logic to rollback the transaction. This is done automatically in case of an exception.
        System.out.println("Transaction rolled back");
    }
}
