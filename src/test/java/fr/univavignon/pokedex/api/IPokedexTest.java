package fr.univavignon.pokedex.api;




import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexTest{

    IPokedex pokedexMock;

    Pokemon pokeBulbizarre;
    Pokemon pokeAquali;
    ArrayList<Pokemon> pokeList;

    @Before
    public void setup() throws PokedexException {

        pokedexMock = mock(IPokedex.class);

        pokeBulbizarre = new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56);
        pokeAquali = new Pokemon(133,"Aquali",186,186,260,2729,202,5000,4,100);

        pokeList = new ArrayList<>();
        pokeList.add(pokeAquali);
        pokeList.add(pokeBulbizarre);

        PokemonComparators pokeComp = PokemonComparators.INDEX;

        when(pokedexMock.getPokemon(0)).thenReturn(pokeBulbizarre);
        when(pokedexMock.getPokemon(133)).thenReturn(pokeAquali);
        when(pokedexMock.getPokemons()).thenReturn(pokeList);
        when(pokedexMock.getPokemons(pokeComp)).thenReturn(pokeList);
        when(pokedexMock.size()).thenReturn(pokeList.size());
        when(pokedexMock.addPokemon(pokeAquali)).thenReturn(133);
        when(pokedexMock.addPokemon(pokeBulbizarre)).thenReturn(0);

    }

    @Test
    public void whenIndex0shouldReturnPokeBulbizarre() throws PokedexException {

        assertEquals(pokedexMock.getPokemon(0), pokeBulbizarre);

    }

    @Test
    public void whenIndex133shouldReturnPokeAquali() throws PokedexException {

        assertEquals(pokedexMock.getPokemon(133), pokeAquali);

    }

    @Test
    public void whenGetPokemonsshouldReturnPokelist() {

        assertEquals(pokedexMock.getPokemons(), pokeList);

    }

    @Test
    public void whenSizeshouldReturnPokeListSize() {

        assertEquals(pokedexMock.size(), pokeList.size());

    }

    @Test
    public void whenPokeAqualishouldReturn133() {

        assertEquals(pokedexMock.addPokemon(pokeAquali), 133);

    }

    @Test
    public void whenPokeBulbizarreshouldReturn0() {

        assertEquals(pokedexMock.addPokemon(pokeBulbizarre), 0);

    }


    @Test
    public void whengetPokemonsWithComparatorshouldReturnPokeList() {

        assertEquals(pokedexMock.getPokemons(PokemonComparators.INDEX), pokeList);

    }

}