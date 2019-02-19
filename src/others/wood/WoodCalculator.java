package others.wood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WoodCalculator {
    public final static int[] WOOD_LEVEL_COST = {0, 60, 80, 100, 120, 160, 180, 200};

    public static void main(String[] args) {
        int farmerNumber;
        List<Farmer> farmerList = new ArrayList<>();

        for (farmerNumber = 1; farmerNumber <= 7; farmerNumber++) {
            for (int cuttingLevel = 0; cuttingLevel <= 30; cuttingLevel++) {
                if (farmerNumber - cuttingLevel >= 5) continue;
                Farmer farmer = new Farmer(farmerNumber, cuttingLevel);
//                System.out.println(farmer.getNumber() + "/" + farmer.getLevel() + ": " + farmer.getProduceCount());
                farmerList.add(farmer);
            }
        }
        System.out.println("=====================================================");
        Collections.sort(farmerList, Comparator.comparing((Farmer farmer) -> farmer.getProduceCount()));
        for (Farmer farmer : farmerList)
            System.out.println(farmer.getNumber() + "/" + farmer.getLevel() + ": " + farmer.getProduceCount()
                    + " Money: " + farmer.getMoney());

    }
}
