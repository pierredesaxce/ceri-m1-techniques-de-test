package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    IPokemonFactory pokeFactory;
    Pokemon pokeBulbizarre;
    Pokemon pokeAquali;

    @Before
    public void setup(){

        pokeFactory = new RocketPokemonFactory();

        pokeBulbizarre = new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56);
        pokeAquali = new Pokemon(133,"Aquali",186,168,260,2729,202,5000,4,100);



    }

    @Test
    public void whenIndex0shouldReturnIndex0() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getIndex(), pokeBulbizarre.getIndex());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnCp613() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getCp(), pokeBulbizarre.getCp());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnHp64() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getHp(), pokeBulbizarre.getHp());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnDust4000() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getDust(), pokeBulbizarre.getDust());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnCandy4() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getCandy(), pokeBulbizarre.getCandy());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnIndex133() {

        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getIndex(), pokeAquali.getIndex());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnCp2729() {

        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getCp(), pokeAquali.getCp());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnHp202() {

        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getHp(), pokeAquali.getHp());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnDust5000() {

        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getDust(), pokeAquali.getDust());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnCandy4() {

        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getCandy(), pokeAquali.getCandy());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnIv100() {

        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getIv(), pokeAquali.getIv(), pokeAquali.getIv());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnIv56() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getIv(), pokeBulbizarre.getIv(), pokeBulbizarre.getIv());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex133shouldReturnNameAquali() {


        try {
            assertEquals(pokeFactory.createPokemon(133,2729,202,5000,4).getName(), pokeAquali.getName());
        } catch (PokedexException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void whenIndex133shouldReturnAttack186() {

        int tempPokeStat = 0;
        try {
            tempPokeStat = pokeFactory.createPokemon(133,2729,202,5000,4).getAttack();
        } catch (PokedexException e) {
            e.printStackTrace();
        }

        assertTrue("expected max : " + pokeAquali.getAttack()+15 +" actual value : "+tempPokeStat, pokeAquali.getAttack()+15 >= tempPokeStat);
        assertTrue("expected min : " + pokeAquali.getAttack() +" actual value : "+tempPokeStat,  pokeAquali.getAttack()  <= tempPokeStat);

    }

    @Test
    public void whenIndex133shouldReturnDefense186() {

        int tempPokeStat = 0;
        try {
            tempPokeStat = pokeFactory.createPokemon(133,2729,202,5000,4).getDefense();
        } catch (PokedexException e) {
            e.printStackTrace();
        }

        assertTrue("expected max : " + pokeAquali.getDefense()+15 +" actual value : "+tempPokeStat, pokeAquali.getDefense()+15 >= tempPokeStat);
        assertTrue("expected min : " + pokeAquali.getDefense() +" actual value : "+tempPokeStat,  pokeAquali.getDefense()  <= tempPokeStat);

    }

    @Test
    public void whenIndex133shouldReturnStamina260() {

        int tempPokeStat = 0;
        try {
            tempPokeStat = pokeFactory.createPokemon(133,2729,202,5000,4).getStamina();
        } catch (PokedexException e) {
            e.printStackTrace();
        }

        assertTrue("expected max : " + pokeAquali.getStamina()+15 +" actual value : "+tempPokeStat, pokeAquali.getStamina()+15 >= tempPokeStat);
        assertTrue("expected min : " + pokeAquali.getStamina() +" actual value : "+tempPokeStat,  pokeAquali.getStamina()  <= tempPokeStat);

    }

    @Test
    public void whenIndex0shouldReturnNameBulbizarre() {

        try {
            assertEquals(pokeFactory.createPokemon(0,613,64,4000,4).getName(), pokeBulbizarre.getName());
        } catch (PokedexException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenIndex0shouldReturnAttack126() {


        int tempPokeStat = 0;
        try {
            tempPokeStat = pokeFactory.createPokemon(0,613,64,4000,4).getAttack();
        } catch (PokedexException e) {
            e.printStackTrace();
        }

        assertTrue("expected max : " + pokeBulbizarre.getAttack()+15 +" actual value : "+tempPokeStat, pokeBulbizarre.getAttack()+15 >= tempPokeStat);
        assertTrue("expected min : " + pokeBulbizarre.getAttack() +" actual value : "+tempPokeStat,  pokeBulbizarre.getAttack()  <= tempPokeStat);

    }

    @Test
    public void whenIndex0shouldReturnDefense126() {


        int tempPokeStat = 0;
        try {
            tempPokeStat = pokeFactory.createPokemon(0,613,64,4000,4).getDefense();
        } catch (PokedexException e) {
            e.printStackTrace();
        }

        assertTrue("expected max : " + pokeBulbizarre.getDefense()+15 +" actual value : "+tempPokeStat, pokeBulbizarre.getDefense()+15 >= tempPokeStat);
        assertTrue("expected min : " + pokeBulbizarre.getDefense() +" actual value : "+tempPokeStat,  pokeBulbizarre.getDefense()  <= tempPokeStat);

    }

    @Test
    public void whenIndex0shouldReturnStamina90() {

        int tempPokeStat = 0;
        try {
            tempPokeStat = pokeFactory.createPokemon(0,613,64,4000,4).getStamina();
        } catch (PokedexException e) {
            e.printStackTrace();
        }

        assertTrue("expected max : " + pokeBulbizarre.getStamina()+15 +" actual value : "+tempPokeStat, pokeBulbizarre.getStamina()+15 >= tempPokeStat);
        assertTrue("expected min : " + pokeBulbizarre.getStamina() +" actual value : "+tempPokeStat,  pokeBulbizarre.getStamina()  <= tempPokeStat);

    }

    @Test(expected = PokedexException.class)
    public void whenIndexMinus1ShouldRaisePokedexException() throws PokedexException {

        pokeFactory.createPokemon(-1,2729,202,5000,4);

    }

}