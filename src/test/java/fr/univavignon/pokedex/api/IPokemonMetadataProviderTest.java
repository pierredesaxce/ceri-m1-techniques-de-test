package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider mockMetadataProvider;
    private PokemonMetadata pokeMetadataBulbizarre;
    private PokemonMetadata pokeMetadataAquali;

    @Before
    public void setup(){

        mockMetadataProvider = mock(IPokemonMetadataProvider.class);

        pokeMetadataBulbizarre = new PokemonMetadata(0,"Bulbizarre",126,126,90);
        pokeMetadataAquali = new PokemonMetadata(133,"Aquali",186,186,260);

        try {

            when(mockMetadataProvider.getPokemonMetadata(0)).thenReturn(pokeMetadataBulbizarre);
            when(mockMetadataProvider.getPokemonMetadata(133)).thenReturn(pokeMetadataAquali);
            when(mockMetadataProvider.getPokemonMetadata(-1)).thenThrow(new PokedexException("Pokemon Totsugeki"));

        } catch (PokedexException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void whenIndex133shouldReturnIndex133() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(133).getIndex(), pokeMetadataAquali.getIndex());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnNameAquali() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(133).getName(), pokeMetadataAquali.getName());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnAttack186() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(133).getAttack(), pokeMetadataAquali.getAttack());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnDefense186() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(133).getDefense(), pokeMetadataAquali.getDefense());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnStamina260() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(133).getStamina(), pokeMetadataAquali.getStamina());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnIndex0() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(0).getIndex(), pokeMetadataBulbizarre.getIndex());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnNameBulbizarre() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(0).getName(), pokeMetadataBulbizarre.getName());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnAttack126() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(0).getAttack(), pokeMetadataBulbizarre.getAttack());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnDefense126() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(0).getDefense(), pokeMetadataBulbizarre.getDefense());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnStamina90() {

        try {

            assertEquals(mockMetadataProvider.getPokemonMetadata(0).getStamina(), pokeMetadataBulbizarre.getStamina());

        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test(expected = PokedexException.class)
    public void whenIndexMinus1ShouldRaisePokedexException() throws PokedexException {

            mockMetadataProvider.getPokemonMetadata(-1);

    }

}