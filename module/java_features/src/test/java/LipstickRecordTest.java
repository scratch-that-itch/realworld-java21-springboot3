import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class LipstickRecordTest {
    @Test
    @Description("Testing behaviour of Java Records, formally introduced in Java 16")
    public void testLipstickRecord() {
        LipstickRecord lorealMatte = new LipstickRecord(LipstickType.MATTE, "Loreal Paris");
        System.out.println(lorealMatte);
        System.out.println("Welcome to the world of " + lorealMatte.brand());
        
        LipstickRecord etudeHouse = new LipstickRecord(LipstickType.TINT, "Etude");
        System.out.println("Welcome to the world of " + etudeHouse.brand());
    }
}
