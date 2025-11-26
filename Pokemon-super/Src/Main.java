public class Main {
    public static void main(String[] args) {
    GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 10, 100, 205,"grass", "bulbabulba", "grassfield", 2);
    FirePokemon firePokemon = new FirePokemon("Charmender", 18, 60, 400, "hotstones", "charchar", 200, "red");
    WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 14, 80, 302, "fish", "squirtledquirtle", "water", 500);
    ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", 30, 100, 610, "bugs", "pikapika", 300, "yellow");

    //grass pokemon
        System.out.println(grassPokemon.eats("grass"));
        System.out.println(grassPokemon.getForrestType());
        System.out.println(grassPokemon.getNumberOfLeaves());
        System.out.println(grassPokemon.speaks("bulbaaaaaaaaa"));
        System.out.println(grassPokemon.getSound());
        System.out.println(grassPokemon.leafStorm(100));
        System.out.println(grassPokemon.getName());

    //fire pokemon
        System.out.println(firePokemon.flameThrower(400));
        System.out.println(firePokemon.getFlameColor());
        System.out.println(firePokemon.getName());
        System.out.println(firePokemon.getFood());
        System.out.println(firePokemon.getFlameTemperature());
        System.out.println(firePokemon.speaks("carcar"));
        System.out.println(firePokemon.inferno(100));

    // water pokemon
        System.out.println(waterPokemon.getWaterState());
        System.out.println(waterPokemon.eats("fishhhy"));
        System.out.println(waterPokemon.rainDance());
        System.out.println(waterPokemon.getSound());
        System.out.println(waterPokemon.surf());


    // electric pokemon
        System.out.println(electricPokemon.electroBall());
        System.out.println(electricPokemon.getElectricityColor());
        System.out.println(electricPokemon.getAmountVolt());
        System.out.println(electricPokemon.eats("bugss"));
        System.out.println(electricPokemon.thunderPunch());
    }
}


