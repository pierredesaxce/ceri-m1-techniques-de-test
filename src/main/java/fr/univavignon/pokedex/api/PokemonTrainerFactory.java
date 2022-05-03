package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements IPokemonTrainerFactory{

    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        PokemonMetadataProvider temp = new PokemonMetadataProvider();
        return new PokemonTrainer(name,team,pokedexFactory.createPokedex(temp,new PokemonFactory(temp)));
    }

}
