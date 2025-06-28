import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionVoidMethodTest {

    @Test
    public void testVoidThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Boom")).when(mockApi).riskyOperation();

        MyService service = new MyService(mockApi);
        assertThrows(RuntimeException.class, service::doRiskyWork);
    }
}
