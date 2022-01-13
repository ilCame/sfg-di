package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectionController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectionController;
import guru.springframework.sfgdi.controllers.SettingInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("---- property ----");

		/* questo non va bene perche' la classe non e' annotata come controller per spring
		 * ma anche aggiungendo la propieta' non andrebbe bene perche' otterremmo un null pointer exception
		 * la risolviamo dicendo a spring di gestire il controller e il service*/
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController)  ctx.getBean("propertyInjectionController");

		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("---- setter ----");

		SettingInjectedController settingInjectedController = (SettingInjectedController) ctx.getBean("settingInjectedController");

		System.out.println(settingInjectedController.getGreeting());

		System.out.println("---- constructor ----");

		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

		System.out.println(constructorInjectionController.getGreeting());

	}

}
