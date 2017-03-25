package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

import static enums.RoomType.*;

public class MarsColony {

    private static final Logger LOGGER = LogManager.getLogger(MarsColony.class);

    public static void main(String[] args) {
        RoomType[] rooms = new RoomType[] {BEDROOM, BATHROOM, KITCHEN, LABORATORY, LOUNGE};
        String s = Arrays.toString(rooms);
        LOGGER.info(s);

        double totalArea = 0.0d;
        for (RoomType room : rooms) {
            totalArea += room.getArea();
        }
        LOGGER.info(totalArea);
    }
}
