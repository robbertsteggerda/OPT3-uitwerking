package com.company;

import java.util.Scanner;

public class MainMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kies een optie");
        System.out.println("1. voer een nieuwe cliënt in");
        System.out.println("2. toon lijst met cliënten");
        System.out.println("3.bereken prijs voor een cliënt");
        System.out.println("4 om af te sluiten)");

        int input = scanner.nextInt();

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

                Database database = Database.getInstance();
                database.addClient(new Client(naam, leeftijd, aantalUren, clientNummer));
                menu();
            case 2:
                Database database1 = Database.getInstance();
                for (int i = 0; i < database1.getClienten().size(); i++) {
                    Client client = database1.getClienten().get(i);
                    client.printInfo();
                }
                menu();
            case 3:
                scanner.nextLine();
                System.out.print("Voer het cliëntnummer in om de prijs te berkeneen: ");
                int ingevoerdClientNummer = scanner.nextInt();
                Database database2 = Database.getInstance();
                for (int i = 0; i < database2.getClienten().size(); i++) {
                    Client client = database2.getClienten().get(i);
                    if (client.getClientnummer() == ingevoerdClientNummer) {
                        IncBTWFactuur factuur = new IncBTWFactuur();
                        System.out.printf("de prijs is €%f", factuur.berekenPrijs(client));
                        System.out.println();
                        menu();
                    }
                    System.out.println("Cliënt kon niet worden gevonden");
                    menu();
                }
            case 4:
                System.out.println("afsluiten...");
        }
    }
}

