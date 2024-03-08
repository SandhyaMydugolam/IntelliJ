package Com.object.overriding;

public class Resturant {
    public static void main(String[] args) {
        Menu menu=new Chinese();
        menu.showItems("starters");
      Chinese chinese=new Chinese();
      chinese.printGames();
        menu =new Indian();
        menu.showItems("breakfast");

    }
}
