package arianalima.school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {
    class SpyMessageService extends MessageService{
        public int count = 0;
        String message;
        String receiver;

        @Override
        public boolean send(String msg, String receiver) {
            count++;
            this.message = msg;
            this.receiver = receiver;
            return false;
        }
    }

    MyApplication app;

    @BeforeEach
    public void setup(){
        app = new MyApplication();

    }

    @Test
    public void processMessage_anyMsgAndAnyReceiver_true(){
        MessageService service = new MessageService(){
            @Override
            public boolean send(String msg, String receiver) {
                return true;
            }
        };
        app.setService(service);
        Message dummy = new Message();
        boolean actual = app.processMessage(dummy);
        Assertions.assertTrue(actual);
    }

    @Test
    public void processMessage_withMsgAndRec_false(){
        SpyMessageService service = new SpyMessageService();
        Message message = new Message();
        message.setReceiver("receiver@email.com");
        message.setContent("Hello world!");

        app.setService(service);

        app.processMessage(message);
        Assertions.assertEquals("Hello world!", service.message);
        Assertions.assertEquals("receiver@email.com", service.receiver);
    }

}
