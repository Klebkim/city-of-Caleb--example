package VendingMachine;
import java.util.ArrayList;
import java.util.List;

import VendingMachine.Drinks;
import VendingMachine.Snacks;

import java.util.List;

public class Machine {

     private List<Snacks> listOfSnacks;

        public List<Snacks> getListOfSnacks(){
            return this.listOfSnacks;
        }

        public void setListOfSnacks(List<Snacks> listOfSnacks) {
            this.listOfSnacks = listOfSnacks;
        }

        public void addSnacks(Snacks mySnacks) {
            this.listOfSnacks.add(mySnacks);
        }

    private List<Drinks> listOfDrinks;

    public List<Drinks> getListOfDrinks(){
        return this.listOfDrinks;
    }

    public void setListOfDrinks(List<Drinks> listOfDrinks) {
        this.listOfDrinks = listOfDrinks;
    }

    public void addSDs(Drinks myDrinks) { this.listOfDrinks.add(myDrinks);
    }









    }
