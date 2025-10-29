abstract class PokemonSuper {
    // variables , minimum of 2 private.
    private String name;
    private int level;
    private int hp;
    private int xp;
    private String food;
    private String sound;

    // constructor, minimum of 1.
    public PokemonSuper(String name, int level, int hp, int xp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.food = food;
        this.sound = sound;
    }

    // getters, minimum of 2.
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    // Setters, minimum of 2.
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // methods, minimum of 2.
    public abstract String eats(String food);
    public abstract String speaks(String sound);
}