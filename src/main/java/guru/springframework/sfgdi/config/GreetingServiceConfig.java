package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.repositories.ItalianGreetingRepository;
import guru.springframework.sfgdi.repositories.ItalianGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean //sto cercando di mimare con la ItalianGreetingRepo un database
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

    @Bean
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
