package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    IPokemonFactory pokeFactory;
    Pokemon pokeBulbizarre;
    Pokemon pokeAquali;

    @BeforeEach
    public void setup(){

        pokeFactory = mock(IPokemonFactory.class);

        pokeBulbizarre = new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56);
        pokeAquali = new Pokemon(133,"Aquali",186,186,260,2729,202,5000,4,100);

        when(pokeFactory.createPokemon(0,613,64,4000,4)).thenReturn(pokeBulbizarre);
        when(pokeFactory.createPokemon(133,2729,202,5000,4)).thenReturn(pokeAquali);


    }

    @Test
    void whenIndex0shouldReturnIndex0() {

        assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getIndex(), pokeBulbizarre.getIndex());

    }

    @Test
    void whenIndex0shouldReturnCp613() {

        assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getCp(), pokeBulbizarre.getCp());

    }

    @Test
    void whenIndex133shouldReturnHp64() {

        assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getHp(), pokeBulbizarre.getHp());

    }

    @Test
    void whenIndex0shouldReturnDust4000() {

        assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getDust(), pokeBulbizarre.getDust());

    }

    @Test
    void whenIndex0shouldReturnCandy4() {

        assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getCandy(), pokeBulbizarre.getCandy());

    }

    @Test
    void whenIndex133shouldReturnIndex133() {

        assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getIndex(), pokeAquali.getIndex());

    }

    @Test
    void whenIndex133shouldReturnCp2729() {

        assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getCp(), pokeAquali.getCp());

    }

    @Test
    void whenIndex133shouldReturnHp202() {

        assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getHp(), pokeAquali.getHp());

    }

    @Test
    void whenIndex133shouldReturnDust5000() {

        assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getDust(), pokeAquali.getDust());

    }

    @Test
    void whenIndex133shouldReturnCandy4() {

        assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getCandy(), pokeAquali.getCandy());

    }

}