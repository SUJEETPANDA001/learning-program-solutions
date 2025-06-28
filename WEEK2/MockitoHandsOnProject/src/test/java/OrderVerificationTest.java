import static org.mockito.Mockito.*;
import org.mockito.InOrder;
import org.junit.jupiter.api.Test;

public class OrderVerificationTest {

    @Test
    public void testOrderOfMethodCalls() {
        ExternalApi mockApi = mock(ExternalApi.class);
        mockApi.sendData("A");
        mockApi.sendData("B");

        InOrder order = inOrder(mockApi);
        order.verify(mockApi).sendData("A");
        order.verify(mockApi).sendData("B");
    }
}
