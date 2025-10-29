class WaterPokemon extends PokemonSuper {
    // variables, minimum of 2 private.
    private String waterState;
    private int waterPressure;

    // constructor, minimum of 1.
    public WaterPokemon(String name, int level, int hp, int xp, String food, String sound, String waterState, int waterPressure) {
        super(name, level, hp, xp, food, sound);
        this.waterState = waterState;
        this.waterPressure = waterPressure;
    }

    // getters, minimum of 2.
    public String getWaterState() {
        return waterState;
    }

    public int getWaterPressure() {
        return waterPressure;
    }

    //setters, minimum of 2.
    public void setWaterState(String waterState) {
        this.waterState = waterState;
    }

    public void setWaterPressure(int waterPressure) {
        this.waterPressure = waterPressure;
    }

    // methods, minimum of 2.
    public String surf() {
        return "SURFFFFFING";
    }
    public String rainDance() {
        return "raainnnnDanceEE";
    }

    // override methods, minimum of 1.
    @Override
    public String speaks(String sound) {
        return sound;
    }

    @Override
    public String eats(String food) {
        return "chopChopCHop eating: " + food;
    }
}

