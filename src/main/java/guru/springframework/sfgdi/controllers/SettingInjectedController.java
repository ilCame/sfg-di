package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SettingInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetin();
    }
}
