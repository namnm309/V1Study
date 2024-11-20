/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btclass18;

import java.util.ArrayList;
import java.util.Scanner;
import btclass18.Shop;
/**
 *
 * @author Ngoc Lan
 */
public class Main {

    
    Scanner sc = new Scanner(System.in);
    private Shop obj;
    public void Menu() {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1.Add new product");
        menu.add("2.Remove product");
        menu.add("3.Itate product list");
        menu.add("4.Search product");
        menu.add("5.exit");
        while (true) {
            System.out.println("=============MENU=================");
            int choice = getIntChoice(menu);
            switch (choice) {
                case 1:
                    obj.addProduct();
                    break;
                case 2:
                    obj.removeProduct();
                    break;
                case 3:
                    obj.iterateProductList();
                    break;
                case 4:
                    Scanner sc=new Scanner(System.in);                    
                    System.out.println("Mời bạn nhập min :"); 
                    int min=sc.nextInt();
                    System.out.println("Mời bạn nhập max : ");
                    int max=sc.nextInt();
                    obj.searchProduct(choice, choice);
                    break;
                case 5:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
            }
        }

    }

    public int getIntChoice(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " - " + list.get(i));
        }
        System.out.println("=============================");
        System.out.println("Please choose from 1 to 7 :");
        int choose = sc.nextInt();

        return choose;
    }

    public static void main(String[] args) {
        
    }
}
