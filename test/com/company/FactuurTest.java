//package com.company;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class FactuurTest {
//    @Test
//    void testBerekenPrijsExBTW(){
//        Factuur factuur = new Factuur(0);
//        Assertions.assertEquals(factuur.berekenPrijsExBTW(0),0);
//        Assertions.assertEquals(factuur.berekenPrijsExBTW(1),750);
//        Assertions.assertEquals(factuur.berekenPrijsExBTW(10),750);
//        Assertions.assertEquals(factuur.berekenPrijsExBTW(24),1800);
//        Assertions.assertEquals(factuur.berekenPrijsExBTW(25),1750);
//        Assertions.assertEquals(factuur.berekenPrijsExBTW(26),1820);
//    }
//    @Test
//    void testBerekenPrijsIncBTW(){
//        Factuur factuur = new Factuur(0);
//        Assertions.assertEquals(factuur.berekenPrijsIncBTW(5,true,true,true),816.75);
//        Assertions.assertEquals(factuur.berekenPrijsIncBTW(5,false,false,false),-1);
//        Assertions.assertEquals(factuur.berekenPrijsIncBTW(15,true,false,false),-1);
//        Assertions.assertEquals(factuur.berekenPrijsIncBTW(15,false,true,true),1012.50);
//        Assertions.assertEquals(factuur.berekenPrijsIncBTW(30,true,false,true),2541);
//        Assertions.assertEquals(factuur.berekenPrijsIncBTW(30,false,true,false),-1);
//    }
//}