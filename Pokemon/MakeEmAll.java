public abstract class MakeEmAll implements Creatable{



    public static int numberOfPokemon = 0;

    
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        Pokemon Charmander = pokedex.createPokemon("Charander", 100, "fire");
        Pokemon Gastly = pokedex.createPokemon("Gastly", 100, "Gost");
        
        pokedex.pokemonInfo(Gastly);
    }

    public Pokemon createPokemon(String name, int health, String type){
        Pokemon pokemon = new Pokemon();
        pokemon.name = name;
        pokemon.health= health;
        pokemon.type= type;
        System.out.println("Made a pokemon");
        numberOfPokemon++;
        return pokemon;
    }
    @Deprecated 
    public void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
        System.out.println("hit ");
    }

}