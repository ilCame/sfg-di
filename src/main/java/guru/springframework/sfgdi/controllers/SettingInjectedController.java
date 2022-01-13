package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SettingInjectedController {

    private GreetingService greetingService;

    @Autowired // sto dicendo a spring che vogliamo un servizio di greeting iniettato dentro questo bean
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetin();
    }
}
