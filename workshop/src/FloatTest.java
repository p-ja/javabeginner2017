import java.math.BigDecimal;

public class FloatTest {

    public static void main(String[] args) {

        float a = 1.000f + 0.100f + 0.100f + 0.100f;
        float b = 1.300f - 0.100f - 0.100f - 0.100f;

        System.out.println(a);
        System.out.println(b);

        // f - d
        float totalFloat = 0f;
        totalFloat += 9.99f;
        totalFloat += 1.99f;
        totalFloat += 0.99f;
        System.out.println(totalFloat);

        BigDecimal totalBD = BigDecimal.ZERO.add(new BigDecimal("9.99")).add(new BigDecimal("1.99")).add(new BigDecimal("0.99"));
        System.out.println(totalBD);

        float f = (1 / 4) * 10;
        int i = Math.round(f);
        System.out.println(i);
    }
}
