package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Calgary", "AB");
        assertEquals(0, list.countCities());
        list.addCity(city1);
        assertEquals(1, list.countCities());
        list.addCity(city2);
        assertEquals(2, list.countCities());
    }

}