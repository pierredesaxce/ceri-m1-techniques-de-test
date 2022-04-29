package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexFactoryTest {

    IPokedexFactory pokedexFactMock;
    IPokemonMetadataProvider pokemonFactMock;
    IPokemonFactory metadataProvMock;
    IPokedex pokedexMock;
    Pokemon pokeBulbizarre;
    Pokemon pokeAquali;

    @Before
    public void setup(){

        pokedexFactMock = mock(IPokedexFactory.class);

        pokemonFactMock = mock(IPokemonMetadataProvider.class);
        metadataProvMock = mock(IPokemonFactory.class);
        pokedexMock = mock(IPokedex.class);

        pokeBulbizarre = new Pokemon(0,"Bulbizarre",126,126, 90,613,64,4000,4,56);
        pokeAquali = new Pokemon(133,"Aquali",186,186,260,2729,202,5000,4,100);

        when(pokedexFactMock.createPokedex(pokemonFactMock,metadataProvMock)).thenReturn(pokedexMock);

    }


    @Test
    public void whenCreatePokedexShouldReturnPokedex() {

        assertEquals(pokedexFactMock.createPokedex(pokemonFactMock,metadataProvMock), pokedexMock);

    }

}
