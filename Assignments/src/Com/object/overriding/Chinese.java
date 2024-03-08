package Com.object.overriding;

public class Chinese extends Menu {
    @Override
    void showItems(String type){
        if (type.equals("starters")) {
            System.out.println("gobi");
            System.out.println("panner gobi");
        } else if (type.equals("lunch")) {
            System.out.println("suzii");
            System.out.println("momos");
        } else
            System.out.println("veg biryani");
    }
    void printGames(){
        System.out.println("games available");
    }
}
