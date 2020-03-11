package gupao.bridge.message;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NomalMessage(message);
        abstractMessage.sendMessage("加班申请","王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请","王总");
    }

}
