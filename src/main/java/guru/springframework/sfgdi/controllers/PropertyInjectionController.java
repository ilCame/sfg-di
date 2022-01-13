package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectionController {

    //the property injected is not what we want to do so we are going to create also the setterinjecting and the one with the constructor
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetin();
    }
}
