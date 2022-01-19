package guru.springframework.sfgdi.config;

import guru.springframework.pet.PetService;
import guru.springframework.pet.PetServiceFactory;
import guru.springframework.sfgdi.repositories.ItalianGreetingRepository;
import guru.springframework.sfgdi.repositories.ItalianGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml") // con questa istruzione stiamo dicendo di guardare al file XML (possiamo farlo sia sul main che su questa classe)
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean("petService")
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory().getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory().getPetService("cat");
    }

    @Bean
    ItalianGreetingRepository italianGreetingRepository(){
        return new ItalianGreetingRepositoryImpl();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nItalianGreetingService i18nItalianGreetingService(ItalianGreetingRepository italianGreetingRepository){
        return new I18nItalianGreetingService(italianGreetingRepository);
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    //@Bean perche' l'ho definito nel file XML
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
