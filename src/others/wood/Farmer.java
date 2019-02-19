package others.wood;

public class Farmer {
    private int number;
    private int level;
    private int produceCount;
    private int money;
    private int wood;

    public Farmer(int number, int level) {
        this.number = number;
        this.level = level;

        this.produceCount = number * 12 + level * 6 * (level / 10 + 1) * number;
        this.money = number * 50 + WoodCalculator.WOOD_LEVEL_COST[level >= 6 ? 6 : level];
    }


    public int getNumber() {
        return number;
    }

    public int getLevel() {
        return level;
    }

    public int getProduceCount() {
        return produceCount;
    }

    public int getMoney() {
        return money;
    }

    public int getWood() {
        return wood;
    }
}
