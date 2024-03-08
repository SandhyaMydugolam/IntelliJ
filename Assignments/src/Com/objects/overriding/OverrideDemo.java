package Com.objects.overriding;

public class OverrideDemo {
    public static void main(String[] args) {
        String choice = "indoor";
        Sports sports = null;
        if (choice.equals("indoor"))
            sports = new Indoor();
        else if (choice.equals("outdoor")) {
            sports = new outdoor();
        } else
            sports = new Sports();
        String[] games = sports.showTypes();
        if (games != null) {
            for (String game :games )
                System.out.println(game);
        }
    }
}
