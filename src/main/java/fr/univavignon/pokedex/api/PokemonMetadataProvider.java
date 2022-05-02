package fr.univavignon.pokedex.api;

import org.apache.commons.collections4.map.UnmodifiableMap;

import java.util.HashMap;
import java.util.Map;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{

    private static Map<Integer, PokemonMetadata> mapMetadata;
    static {
        Map<Integer, PokemonMetadata> aMap = new HashMap<>();
        aMap.put(0, new PokemonMetadata(0,"Bulbizarre",126,126,90));
        aMap.put(133, new PokemonMetadata(133,"Aquali",186,168,260));

        mapMetadata = UnmodifiableMap.unmodifiableMap(aMap);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if(!mapMetadata.containsKey(index)){
            throw new PokedexException("Cet id ne correspond à aucun Pokemon");
        }
        return mapMetadata.get(index);
    }

}
