class FirePokemon extends PokemonSuper {
    // variables, minimum of 2 private.
    private int flameTemperature;
    private String flameColor;

    // constructor, minimum of 1.

    public FirePokemon(String name, int level, int hp, int xp, String food, String sound, int flameTemperature, String flameColor) {
        super(name, level, hp, xp, food, sound);
        this.flameTemperature = flameTemperature;
        this.flameColor = flameColor;
    }

    // getters, minimum of 2.
    public int getFlameTemperature() {
        return flameTemperature;
    }

    public String getFlameColor() {
        return flameColor;
    }

    //setters, minimum of 2.
    public void setFlameTemperature(int flameTemperature) {
        this.flameTemperature = flameTemperature;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }

    // methods, minimum of 2.
   public int inferno(int xp) {
        return xp + 60;
   }

    public int flameThrower(int xp) {
        return xp + 22;
    }

    // override methods, minimum of 1.
    @Override
    public String eats(String food) {
        return "ImmpImmp eating: " + food;
    }

    @Override
    public String speaks(String sound) {
        return sound;
    }
}