package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		/* posso chiedere al contesto una istanza del mio controller, faccio un cast
		* perche' mi restituisce un tipo object e poi posso utilizzare il metodo getBean
		* dandogli il nome del bean. e questo e' come chiediamo al contesto di spring.*/

		String greeting = myController.sayHello();

		System.out.println(greeting);

		/*non abbiamo dovuto creare una nuova istanza con new perche' sara' spring a creare quella istanza
		* poi mettimela nel contesto.
		*
		* quindi in linea 14 diciamo a spring di volere una istanza di questo oggetto, quindi
		* dammi una istanza di questo bean dal contesto
		*
		* la costruzione di myController e' controllata da Spring Framework
		*
		* per la dependency injection devo fare in modo che sia il framework a creare e fornire gli oggetti instanziati*/
	}

}
