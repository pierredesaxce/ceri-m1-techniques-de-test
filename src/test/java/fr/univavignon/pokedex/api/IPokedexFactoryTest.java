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

    @Before
    public void setup(){

        pokedexFactMock = mock(IPokedexFactory.class);

        pokemonFactMock = mock(IPokemonMetadataProvider.class);
        metadataProvMock = mock(IPokemonFactory.class);
        pokedexMock = mock(IPokedex.class);

        when(pokedexFactMock.createPokedex(pokemonFactMock,metadataProvMock)).thenReturn(pokedexMock);

    }


    @Test
    public void whenCreatePokedexShouldReturnPokedex() {

        assertEquals(pokedexFactMock.createPokedex(pokemonFactMock,metadataProvMock), pokedexMock);

    }

}
