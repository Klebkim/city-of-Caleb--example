package VendingMachine;
import java.util.List;

public class Machine {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public List<Snack> getSnackslist() {
        return snackslist;
    }

    public void setSnackslist(List<Snack> snackslist) {
        this.snackslist = snackslist;
    }

    private String name;
    private double money;

    private List<Drink> drinkList;
    private List<Snack> snackslist;

    }
