package fr.univavignon.pokedex.api;

import org.apache.commons.collections4.map.UnmodifiableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PokemonFactory implements IPokemonFactory{

    PokemonMetadataProvider tempMetadataProvider;

    public PokemonFactory(PokemonMetadataProvider tempMetadataProvider){

        this.tempMetadataProvider = tempMetadataProvider;

    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) throws PokedexException {

        PokemonMetadata tempMetadata = tempMetadataProvider.getPokemonMetadata(index);
        Pokemon genPokemon;

        assert tempMetadata != null;
        Random rand = new Random();
        int attackRandomValue = rand.nextInt(16)-1;
        int defenseRandomValue = rand.nextInt(16)-1;
        int staminaRandomValue = rand.nextInt(16)-1;

        double ivCalc = (attackRandomValue+defenseRandomValue+staminaRandomValue)/45*100;

        genPokemon =  new Pokemon(index,tempMetadata.getName(),tempMetadata.getAttack()+attackRandomValue,tempMetadata.getDefense()+defenseRandomValue,tempMetadata.getStamina()+staminaRandomValue, cp, hp, dust, candy, ivCalc);

        return genPokemon;
    }

}
