import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;

public class ArgumentMatcherTest {

    @Test
    public void testSendDataWithArgumentMatcher() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.send("Hello");
        verify(mockApi).sendData(anyString());
    }
}
