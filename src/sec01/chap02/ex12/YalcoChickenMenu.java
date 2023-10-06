package sec01.chap02.ex12;

public enum YalcoChickenMenu {
    FR("후라이드", 15000, 0),
    GJ("간장", 20000, 1),
    YN("앙념",18000,2);

    private String name;
    private int price;
    private int spicyLevel;

    YalcoChickenMenu(String name, int price, int spicyLevel) {
        this.name = name;
        this.price = price;
        this.spicyLevel = spicyLevel;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc () {
        String peppers = "";
        if (spicyLevel > 0){
            peppers = "🌶️".repeat(spicyLevel);
        }
        return "%s, %d, %s".formatted(name, price, peppers);
    }

}
