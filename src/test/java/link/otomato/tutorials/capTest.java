package link.otomato.tutorials;
import org.junit.jupiter.api.Test;

class capTest {

    @Test
    void capTest() {
        assert HelloGradle.capitalize("nAMe") == "Name";
    }
    
    @Test
    void failTest() {
        assert true == false;
    }
}
