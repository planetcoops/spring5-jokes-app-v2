package guru.springframework.spring5jokesappv2.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JokeServiceImplTest {
    private JokeService jokeService;

    @BeforeEach
    void setUp() {
        jokeService = new JokeServiceImpl();
    }


    @Test
    void getRandomJoke() {
        assertNotNull(jokeService);
        String joke = jokeService.getRandomJoke();
        assertTrue(joke != null && joke.length() > 0);
    }
}