/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.List;
import java.util.ArrayList;

public class ShoppingBasket {
    private List<Purchase> purchases;
    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price) {
        boolean flag = false;
        for (Purchase p : purchases) {
            if (p.getName() == product) {
                p.increaseAmount();
                flag = true;
            }
        }
        if (!flag) {
            purchases.add(new Purchase(product, 1, price));            
        }            

    }
    public int price() {
        int sum = 0;
        for (Purchase p : purchases) {
            sum += p.price();
        }
        return sum;
    }
    public void print() {
        for (Purchase p : purchases) {
            System.out.println(p);
        }
    }
    
}
