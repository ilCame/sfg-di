package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---- Primary Bean ----");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController)  ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("----    Setter     ---");
		SettingInjectedController settingInjectedController = (SettingInjectedController) ctx.getBean("settingInjectedController");
		System.out.println(settingInjectedController.getGreeting());

		System.out.println("---- Constructor ----");
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreeting());

		System.out.println("---- i18nController ----");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("---- PetController ----");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


	}

}
