package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokemonComparatorsTest {

    Pokemon pokeAquali = new Pokemon(133,"Aquali",186,186,260,2729,202,5000,4,100);


    @Test
    public void whenSamePokemonComparedShouldReturn0() {

        PokemonComparators index = PokemonComparators.INDEX;
        assertEquals(index.compare(pokeAquali,pokeAquali),0);

    }
}