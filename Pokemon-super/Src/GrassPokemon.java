class GrassPokemon extends PokemonSuper {
    // variables, minimum of 2 private.
    private String forrestType;
    private int numberOfLeaves;

    // constructor, minimum of 1.
    public GrassPokemon(String name, int level, int hp, int xp, String food, String sound, String forrestType, int numberOfLeaves) {
        super(name, level, hp, xp, food, sound);
        this.forrestType = forrestType;
        this.numberOfLeaves = numberOfLeaves;
    }

    // getters, minimum of 2.
    public String getForrestType() {
        return forrestType;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    //setters, minimum of 2.
    public void setForrestType(String forrestType) {
        this.forrestType = forrestType;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    // methods, minimum of 2.

    public int leafStorm(int xp) {
       return xp + 25;
    }

    public int leaveBlade(int xp) {
        return xp + 10;
    }

    // override methods, minimum of 1.
    @Override
    public String eats(String food) {
        return "OmNOmOm eating: " + food;
    }

    @Override
    public String speaks(String sound) {
       return sound;
    }
}