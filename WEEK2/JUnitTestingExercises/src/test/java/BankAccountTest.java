import org.junit.*;
import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("12345", "John Doe", 1000.00);
        System.out.println("Setting up test...");
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testDeposit() {
        double initialBalance = account.getBalance();
        double depositAmount = 500.0;
        account.deposit(depositAmount);
        assertEquals(initialBalance + depositAmount, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSufficientFunds() {
        double initialBalance = account.getBalance();
        double withdrawAmount = 200.0;
        account.withdraw(withdrawAmount);
        assertEquals(initialBalance - withdrawAmount, account.getBalance(), 0.001);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testWithdrawInsufficientFunds() {
        account.withdraw(2000.0);
    }

    @Test
    public void testAccountDetails() {
        assertEquals("12345", account.getAccountNumber());
        assertEquals("John Doe", account.getAccountHolder());
    }

    @BeforeClass
    public static void classSetup() {
        System.out.println("Starting BankAccount tests...");
    }

    @AfterClass
    public static void classTeardown() {
        System.out.println("Finished BankAccount tests!");
    }
}
