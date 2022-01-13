package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // ottengo un errore su spring, devo qualificarne uno per property e uno per il constructor
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreetin() {
        return "Hello World - Property";
    }
}
