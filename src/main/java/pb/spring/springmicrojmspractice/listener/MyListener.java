package pb.spring.springmicrojmspractice.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pb.spring.springmicrojmspractice.config.JmsConfig;
import pb.spring.springmicrojmspractice.model.HelloWorldMessage;

@Component
public class MyListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers,
                       Message message){
        System.out.println("I got a message");
        System.out.println(helloWorldMessage);

    }
}
