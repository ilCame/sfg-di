package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IT")
@Service ("i18nService")
public class I18nItalianGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Ciao Mondo - IT";
    }
}
