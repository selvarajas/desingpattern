package test;
 
import com.roytuts.spring.jms.producer.MessageProducer;
 
public class MessageProducerTest {
 
	private MessageProducer messageProducer;
 
	@SuppressWarnings("resource")
	@Before
	public void setUp() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/apache-activemq-context.xml");
		messageProducer = (MessageProducer) applicationContext
				.getBean("messageProducer");
	}
 
	@Test
	public void testSendMessageToDefaultDestination() {
		messageProducer
				.sendMessageToDefaultDestination("Send this message to default destination.");
	}
	
}