package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonTrainerFactoryTest {

    IPokemonTrainerFactory pokeTrainerFactMock;

    Pokemon pokeBulbizarre;
    Pokemon pokeAquali;
    PokemonTrainer pokeTrainer;
    IPokedexFactory pokedexFactMock;

    @Before
    public void setup(){

        pokeTrainerFactMock = mock(IPokemonTrainerFactory.class);

        pokeBulbizarre = new Pokemon(0,"Bulbizarre",126,126, 90,613,64,4000,4,56);
        pokeAquali = new Pokemon(133,"Aquali",186,186,260,2729,202,5000,4,100);

        IPokedex pokedexMock = mock(IPokedex.class);



        pokeTrainer = new PokemonTrainer("Gamer",Team.MYSTIC,pokedexMock);

        pokedexFactMock = mock(IPokedexFactory.class);

        when(pokeTrainerFactMock.createTrainer(pokeTrainer.getName(),pokeTrainer.getTeam(), pokedexFactMock)).thenReturn(pokeTrainer);

    }

    @Test
    public void whenCreatingTrainerNameShouldReturnGamer() {

        assertEquals(pokeTrainerFactMock.createTrainer(pokeTrainer.getName(),pokeTrainer.getTeam(), pokedexFactMock).getName(), pokeTrainer.getName());

    }

    @Test
    public void whenCreatingTrainerTeamShouldReturnMystic() {

        assertEquals(pokeTrainerFactMock.createTrainer(pokeTrainer.getName(),pokeTrainer.getTeam(), pokedexFactMock).getTeam(), pokeTrainer.getTeam());

    }

    @Test
    public void whenCreatingTrainerPokedexShouldReturnPokedex() {

        assertEquals(pokeTrainerFactMock.createTrainer(pokeTrainer.getName(),pokeTrainer.getTeam(), pokedexFactMock).getPokedex(), pokeTrainer.getPokedex());

    }

}
