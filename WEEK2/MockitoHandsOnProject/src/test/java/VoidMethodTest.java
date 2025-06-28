import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class VoidMethodTest {

    @Test
    public void testVoidMethodInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).sendData("Done");

        mockApi.sendData("Done");
        verify(mockApi).sendData("Done");
    }
}
