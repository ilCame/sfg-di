package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    //abbiamo modificato questo controller in modo tale da poter utilizzare il Prymary greeting service
    private final GreetingService greetingService;

    //non lo abbiamo annotato con qualifier perche' vogliamo che usi il primario
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
