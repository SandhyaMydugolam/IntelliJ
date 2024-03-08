package Com.object.overriding;

public class Indian extends Menu{
    @Override

    void showItems(String type){
        if (type.equals("breafast")){
        System.out.println("dosa");
        System.out.println("idly");
    } else if (type.equals("snacks")) {
            System.out.println("panipuri");
            System.out.println("icecream");
            System.out.println("toast");
        }
        else
            System.out.println("veg roll");

        }
    }
