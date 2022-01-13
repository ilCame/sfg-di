package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired // questo dice a spring di inniettare una istanza di greeting service ma dai dei problemi comunque, dobbiamo dire a spring anche di service
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetin();
    }
}
