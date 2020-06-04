package pb.spring.springmicrojmspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmicrojmspracticeApplication {

    public static void main(String[] args) {
//        try {
//            ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//                    .setPersistenceEnabled(false)
//                    .setJournalDirectory("target/data/journal")
//                    .setSecurityEnabled(false)
//                    .addAcceptorConfiguration("invm", "vm://0"));
//
//            server.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        SpringApplication.run(SpringmicrojmspracticeApplication.class, args);
    }

}
