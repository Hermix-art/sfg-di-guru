package guru.springframework.sfgdi.repositories;

/**
 * @author Herman Kulik
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello, Sir!";
    }
}
