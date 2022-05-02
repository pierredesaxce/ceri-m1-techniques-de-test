package fr.univavignon.pokedex.api;

import org.apache.commons.collections4.map.UnmodifiableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PokemonFactory implements IPokemonFactory{


    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        PokemonMetadataProvider tempMetadataProvider = new PokemonMetadataProvider();
        PokemonMetadata tempMetadata = null;
        try {
            tempMetadata = tempMetadataProvider.getPokemonMetadata(index);
        } catch (PokedexException e) {
            e.printStackTrace();
        }
        Pokemon genPokemon;

        assert tempMetadata != null;
        Random rand = new Random();
        int attackRandomValue = rand.nextInt(0,15);
        int defenseRandomValue = rand.nextInt(0,15);
        int staminaRandomValue = rand.nextInt(0,15);

        genPokemon =  new Pokemon(index,tempMetadata.getName(),tempMetadata.getAttack()+attackRandomValue,tempMetadata.getDefense()+defenseRandomValue,tempMetadata.getStamina()+staminaRandomValue, cp, hp, dust, candy, (attackRandomValue+defenseRandomValue+staminaRandomValue)/45*100);

        return genPokemon;
    }

}
