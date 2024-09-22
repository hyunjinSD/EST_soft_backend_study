package chap11.queue;

public class Message {
    String command;  // sendMail, sendKakaoTalk, sendSms
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}
