package com.company;

import java.util.Scanner;

public class MainMenu { //als je onjuiste input geeft reageert het programma niet goed. Helaas had ik geen tijd om dit op te lossen. Zolang uw input correct is zou het programma correct moeten werken
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kies een optie");
        System.out.println("1. voer een nieuwe cliënt in");
        System.out.println("2. toon lijst met cliënten");
        System.out.println("3.bereken prijs voor een cliënt");

        int input = scanner.nextInt();
        Database database = Database.getInstance();

        switch (input) {
            case 1:
                scanner.nextLine();
                System.out.print("Voer de naam in: ");
                String naam = scanner.nextLine();
                System.out.print("Voer de leeftijd in: ");
                int leeftijd = scanner.nextInt();
                System.out.print("Voer het aantal uren van de behandeling in: ");
                int aantalUren = scanner.nextInt();
                System.out.print("Voer het cliëntnummer in in: ");
                int clientNummer = scanner.nextInt();


                database.addClient(new Client(naam, leeftijd, aantalUren, clientNummer));
                menu();
            case 2:
                for (int i = 0; i < database.getClienten().size(); i++) {
                    Client client = database.getClienten().get(i);
                    client.printInfo();
                }
                menu();
            case 3:
                scanner.nextLine();
                System.out.print("Voer het cliëntnummer in om de prijs te berekenen: ");
                int ingevoerdClientNummer = scanner.nextInt();
                for (int i = 0; i < database.getClienten().size(); i++) {
                    Client client = database.getClienten().get(i);
                    if (client.getClientnummer() == ingevoerdClientNummer) {
                        IncBTWFactuur factuur = new IncBTWFactuur();
                        System.out.printf("de prijs is €%f", factuur.berekenPrijs(client));
                        System.out.println();
                        menu();
                    }
                }
        }
    }
}

