import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by javadev on 3/24/17.
 */
public class Arrays {

    private static final Logger LOGGER = LogManager.getLogger(Arrays.class);

    public static void main(String[] args) {
        int[] intArr = new int[] {1, 2, 3};
        LOGGER.info(intArr[2]);

        int[] intArr2 = new int[3];
        intArr2[0] = 1;
        LOGGER.info(intArr2[1]);
        //LOGGER.info(intArr2[99]);

        String[] strArr = new String[] {"Aaa", "Bbb", "Ccc"};
        LOGGER.info(strArr);

        String strArr2[] = new String[2];
    }
}

