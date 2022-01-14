package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"IT", "default"}) //stiamo fornendo una lista di valori, in questo modo qunando facciamo partire il programma utilizzera' questo bean
@Service ("i18nService")
public class I18nItalianGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Ciao Mondo - IT";
    }
}
