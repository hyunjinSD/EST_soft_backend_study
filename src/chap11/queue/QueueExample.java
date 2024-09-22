package chap11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendKakaoTalk", "제니"));
        messageQueue.offer(new Message("sendMail", "리사"));
        messageQueue.offer(new Message("sendSms", "로제"));

        // switch-case 문 이용해서 특정 command일 경우 각각 출력문 다르게

        for (Message message : messageQueue) {
            switch (message.getCommand()) {
                case "sendKakaoTalk" -> System.out.println(message.getTo() + "에게 카톡을 보냅니다");
                case "sendMail" -> System.out.println(message.getTo() + "에게 문자를 보냅니다");
                case "sendSms" -> System.out.println(message.getTo() + "에게 sms를 보냅니다");
            }
        }
    }
}
