class ElectricPokemon extends PokemonSuper {
    // variables, minimum of 2 private.
    private int amountVolt;
    private String electricityColor;

    // constructor, minimum of 1.
    public ElectricPokemon(String name, int level, int hp, int xp, String food, String sound, int amountVolt, String electricityColor) {
        super(name, level, hp, xp, food, sound);
        this.amountVolt = amountVolt;
        this.electricityColor = electricityColor;
    }

    // getters, minimum of 2.
    public int getAmountVolt() {
        return amountVolt;
    }

    public String getElectricityColor() {
        return electricityColor;
    }

    //setters, minimum of 2.
    public void setAmountVolt(int amountVolt) {
        this.amountVolt = amountVolt;
    }

    public void setElectricityColor(String electricityColor) {
        this.electricityColor = electricityColor;
    }

    // methods, minimum of 2.
   public String electroBall() {
       return "ELEktroBAllll";
   }
   public String thunderPunch() {
       return "-THUNDER-PUNCH-";
   }

    // override methods, minimum of 1.
    @Override
    public String eats(String food) {
        return "SSsspSSsspssP eating: " + food;
    }

    @Override
    public String speaks(String sound) {
        return sound;
    }
}