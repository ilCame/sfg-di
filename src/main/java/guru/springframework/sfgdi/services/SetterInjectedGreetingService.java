package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*il problema e' qua, non ho settato questa classe come un servizio quindi
* spring non la riconosce e non riesce a gestirla. sarebbe da annotare come @Service*/

public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
