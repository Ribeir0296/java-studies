enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int cents;

    Coin(int cents) {
        this.cents = cents;
    }

    int cents() {
        return cents;
    }
}

void main() {
    String[] names = IO.readln().trim().split(" +");

    EnumMap<Coin, Integer> counts = new EnumMap<>(Coin.class);
    int total = 0;

    for (String name : names) {
        if (name.isEmpty()) {
            continue;
        }
        try {
            Coin coin = Coin.valueOf(name.toUpperCase());
            counts.merge(coin, 1, Integer::sum);
            total += coin.cents();
        } catch (IllegalArgumentException e) {
            IO.println("Unknown coin: " + name);
        }
    }

    for (Coin coin : Coin.values()) {
        if (counts.containsKey(coin)) {
            IO.println(coin.name() + " x" + counts.get(coin));
        }
    }
    IO.println("Total: " + total + " cents");
}
