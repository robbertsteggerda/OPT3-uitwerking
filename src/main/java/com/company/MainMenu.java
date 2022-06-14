package com.company;

import java.util.Scanner;

public class MainMenu { //als je onjuiste input geeft reageert het programma niet goed. Helaas had ik geen tijd om dit op te lossen. Zolang uw input correct is zou het programma correct moeten werken
    public static void menu() {
        Database database = Database.getInstance();
        printMenu();

        switch (getInputInt()) {
            case 1:
                clientInvoeren(database);
                break;
            case 2:
                toonClientInfo((database));
                break;
            case 3:
                berekenPrijs(database);
                break;
        }
        menu();
    }

    private static void printMenu() {
        System.out.println("kies een optie");
        System.out.println("1. voer een nieuwe cliënt in");
        System.out.println("2. toon lijst met cliënten");
        System.out.println("3.bereken prijs voor een cliënt");
    }

    public static void clientInvoeren(Database database) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer de naam in: ");
        String naam = scanner.nextLine();
        System.out.print("Voer de leeftijd in: ");
        int leeftijd = scanner.nextInt();
        System.out.print("Voer het aantal uren van de behandeling in: ");
        int aantalUren = scanner.nextInt();
        System.out.print("Voer het cliëntnummer in in: ");
        int clientNummer = scanner.nextInt();

        database.addClient(new Client(naam, leeftijd, aantalUren, clientNummer));
    }

    public static void toonClientInfo(Database database) {
        for (int i = 0; i < database.getClienten().size(); i++) {
            Client client = database.getClienten().get(i);
            client.printInfo();
        }
    }

    public static void berekenPrijs(Database database) {
        System.out.print("Voer het cliëntnummer in om de prijs te berekenen: ");
        int ingevoerdClientNummer = getInputInt();
        for (int i = 0; i < database.getClienten().size(); i++) {
            Client client = database.getClienten().get(i);
            if (client.getClientnummer() == ingevoerdClientNummer) {
                IncBTWFactuur factuur = new IncBTWFactuur();
                System.out.printf("de prijs is €%f", factuur.berekenPrijs(client));
                System.out.println();
            }
        }
    }

    public static int getInputInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

