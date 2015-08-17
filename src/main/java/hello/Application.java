package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] arg) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Confggg.class);
		MyService myService = (MyService) ctx.getBean("myService");

		System.out.println(">>>>>" + myService.go());
	}

}