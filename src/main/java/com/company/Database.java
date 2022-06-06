package com.company;

import java.util.ArrayList;

public class Database { //ik simuleer de database voor deze opdracht met behulp van een Singleton omdat het maken van een database buiten de scope van dit project valt
    private ArrayList<Client> clienten;
    private static Database database;

    private Database(){
        this.clienten = new ArrayList<>();
        clienten.add(new Client("peter",24,12,12345));
    }

    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    public ArrayList<Client> getClienten(){
        return clienten;
    }

    public void addClient (Client client){
        clienten.add(client);
    }
}