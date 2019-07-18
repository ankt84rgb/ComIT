public class Coins {
    private String name = null;
    private int value = 0;

    public Coins(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int coinsNeeded(int total)
    {
        return total / this.value;
    }
    public int totalAfterValue(int total)
    {
        return total % this.value;
    }
}
