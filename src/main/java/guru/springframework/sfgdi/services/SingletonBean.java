package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    //questo costruttore e' chiamato alla fine dell'inizializzazione di spring ed e' l'ultimo bean a essere creato. viene quindi inizializzato in fase di startup
    public SingletonBean(){
        System.out.println("Creating a Singleton bean");
    }
    public String getMyScope(){
        return "i'm a Singleton";
    }
}
