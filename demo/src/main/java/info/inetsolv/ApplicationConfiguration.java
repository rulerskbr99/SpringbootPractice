package info.inetsolv;

import org.springframework.beans.factory.annotation.Value;

//@Configuration
public class ApplicationConfiguration {
	
	//@Bean 
	public MyMessage myMessage(@Value("${my.messageValue}") String messageValue) {
		
		MyMessage myMessage = new MyMessage();
		myMessage.setMessageValue(messageValue);
		return myMessage;	
	}

}