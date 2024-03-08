package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu menu=()->{
            System.out.println("Indian breakfast");
            System.out.println("Masala dosa");
            System.out.println("Dosa");
            System.out.println("idly");
        };
        IMenu menu1=()->{
            System.out.println("chinese food");
            System.out.println("noodles");
            System.out.println("gobi");
            System.out.println("pp");
        };
        IMenu menu2=()->{
            System.out.println("italian food");
            System.out.println("momos");
            System.out.println("maggi");
            System.out.println("pasta");
        };
        menu.showMenus();
        menu1.showMenus();
        menu2.showMenus();

    }
}
