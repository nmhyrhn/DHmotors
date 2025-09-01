package DHmotors.Util;

import java.util.*;

public final class RandomUtil {
    private static Random rand = new Random();
    private static Set<String> usedContracts = new HashSet<>();
    private static Set<String> usedPlates = new HashSet<>();

    public static String generateContractNo() {
        String num;
        do {
            num = String.valueOf(rand.nextInt(900000000) + 100000000);
        } while (usedContracts.contains(num));
        usedContracts.add(num);
        return num;
    }

    public static String generatePlate() {
        String plate;
        do {
            String digits1 = String.format("%03d", rand.nextInt(1000));
            char letter = (char) (rand.nextInt(26) + 'A');
            String digits2 = String.format("%04d", rand.nextInt(10000));
            plate = digits1 + letter + digits2;
        } while (usedPlates.contains(plate));
        usedPlates.add(plate);
        return plate;
    }
}
