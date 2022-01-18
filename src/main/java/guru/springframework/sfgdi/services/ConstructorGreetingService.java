package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

//@Service posso rimuovere l'annotazione perche' la gestisco attraverso il gratingserviceconfig
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
