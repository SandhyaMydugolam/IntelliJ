package Com.objects.overriding;

public class outdoor extends Sports {
    @Override
    String[] showTypes() {
        return new String[]{"cricket","Foot Ball","Shuttle"};
    }
}
