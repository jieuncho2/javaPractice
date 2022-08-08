package chapter12;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
}

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaoTalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to +"님에게 메일을 보냈습니다.");
					break;
				case "sendSMS":
					System.out.println(message.to +"님에게 문자를 보냈습니다.");
					break;
				case "sendKakaoTalk":
					System.out.println(message.to +"님에게 카카오톡을 보냈습니다.");
					break;
			}
		}
	}

}
