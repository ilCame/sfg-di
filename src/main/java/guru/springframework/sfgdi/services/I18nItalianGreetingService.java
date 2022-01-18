package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.ItalianGreetingRepository;

public class I18nItalianGreetingService implements GreetingService{

    private final ItalianGreetingRepository italianGreetingRepository;

    public I18nItalianGreetingService(ItalianGreetingRepository italianGreetingRepository) {
        this.italianGreetingRepository = italianGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Ciao Mondo - IT";
    }
}
