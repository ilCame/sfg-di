package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // e' una interfaccia che possiamo prendere da spring e affidargli come Scope prototype
@Component
public class PrototypeBean {

    //viene creato due volte perche' l'abbiamo chiesto due volte
    public PrototypeBean() {
        System.out.println("Creating a prototype bean --------");
    }

    public String getMyScope(){
        return "i'm a Prototype";
    }
}
