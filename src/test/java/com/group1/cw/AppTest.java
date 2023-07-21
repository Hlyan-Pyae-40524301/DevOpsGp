package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    //Testing for Countries Report by Population
    @Test
    void printCountriesTestNull()
    {
        app.printCountriesByPopulation(null);
    }
    @Test
    void printCountriesTestEmpty()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        app.printCountriesByPopulation(country);
    }
    @Test
    void printCountriesTestContainsNull()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        country.add(null);
        app.printCountriesByPopulation(country);
    }
    @Test
    void printCountries()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "CHN";
        cou.Name = "China";
        cou.Continent = "Asia";
        cou.Region = "Eastern Asia";
        cou.Population = 1277558000;
        cou.Capital = "1891";
        country.add(cou);
        app.printCountriesByPopulation(country);
    }

    //Testing for Countries In Continent Report by Population
    @Test
    void printCountriesInContinentTestNull()
    {
        app.printCountriesInContinentByPopulation(null);
    }
    @Test
    void printCountriesInContinentTestEmpty()
    {
        ArrayList<Country> country1 = new ArrayList<Country>();
        app.printCountriesInContinentByPopulation(country1);
    }
    @Test
    void printCountriesInContinentTestContainsNull()
    {
        ArrayList<Country> country1 = new ArrayList<Country>();
        country1.add(null);
        app.printCountriesInContinentByPopulation(country1);
    }
    @Test
    void printCountriesInContinent()
    {
        ArrayList<Country> country1 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "CHN";
        cou.Name = "China";
        cou.Continent = "Asia";
        cou.Region = "Eastern Asia";
        cou.Population = 1277558000;
        cou.Capital = "1891";
        country1.add(cou);
        app.printCountriesInContinentByPopulation(country1);
    }

    //Testing for Countries In Region Report by Population
    @Test
    void printCountriesInRegionTestNull()
    {
        app.printCountriesInRegionByPopulation(null);
    }
    @Test
    void printCountriesInRegionTestEmpty()
    {
        ArrayList<Country> country2 = new ArrayList<Country>();
        app.printCountriesInRegionByPopulation(country2);
    }
    @Test
    void printCountriesInRegionTestContainsNull()
    {
        ArrayList<Country> country2 = new ArrayList<Country>();
        country2.add(null);
        app.printCountriesInRegionByPopulation(country2);
    }
    @Test
    void printCountriesInRegion()
    {
        ArrayList<Country> country2 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "BRA";
        cou.Name = "Brazil";
        cou.Continent = "South America";
        cou.Region = "South America";
        cou.Population = 170115000;
        cou.Capital = "211";
        country2.add(cou);
        app.printCountriesInRegionByPopulation(country2);
    }


}