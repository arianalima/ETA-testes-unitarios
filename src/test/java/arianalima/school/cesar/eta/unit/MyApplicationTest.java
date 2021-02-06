package arianalima.school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {
    class TestMessageService extends MessageService{
        @Override
        public boolean send(String msg, String receiver) {
            return true;
        }
    }

    @Test
    public void processMessage_anyMsgAdnAnyReceiver_true(){
        TestMessageService service = new TestMessageService();
        MyApplication app = new MyApplication();
        app.setService(service);
        boolean actual = app.processMessage("", "");
        Assertions.assertTrue(actual);
    }

}
