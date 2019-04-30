import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

public class Main {

    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:C:\\Users\\ikarak\\Desktop\\inbox?noop=true")
                        .to("activemq:queue:test");
            }
        });

        context.start();
        Thread.sleep(10000);
        context.stop();
    }

    public void fileCopierWithCamel() throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:C:\\Users\\ikarak\\Desktop\\inbox?noop=true")
                        .to("file:C:\\Users\\ikarak\\Desktop\\outbox");
            }
        });
        context.start();
        Thread.sleep(10000);
        context.stop();
    }

    public void activeMQPublisherWithCamel() throws Exception {
//        CamelContext context = new DefaultCamelContext();
//        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:1883");
//        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
//        Connection connection = connectionFactory.createConnection();
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        Topic topic = session.createTopic("TestTopic");
//        MessageProducer producer = session.createProducer(topic);
//        TextMessage msg = session.createTextMessage();
//        msg.setText("Hello JMS World");
//        producer.send(msg);
    }


}
