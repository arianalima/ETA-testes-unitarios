package arianalima.school.cesar.eta.unit;

public class MyApplication {
    private MessageService service = new MessageService();

    public void setService(MessageService svc){
        this.service = svc;
    }

    public boolean processMessage(Message message){
        return this.service.send(message.getContent(), message.getReceiver());
    }
}
