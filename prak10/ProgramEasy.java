import java.util.ArrayList;
import java.util.List;

public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang = new ArrayList<>();
        IFlyer superman1 = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer eagle1 = new Bird();
        IFlyer eagle2 = new Bird();

        koleksiBisaTerbang.add(superman1);
        koleksiBisaTerbang.add(superboy);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(eagle1);
        koleksiBisaTerbang.add(eagle2);

        for (IFlyer bisaTerbang : koleksiBisaTerbang) {
            if (bisaTerbang instanceof Superman) {
                System.out.println("I'm " + ((Superman) bisaTerbang).getName());
                System.out.println("Bangsa: " + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.println("makan:");
                ((Superman) bisaTerbang).eat();
                System.out.println();
            } else {
                System.out.println("I'm " + bisaTerbang.getClass().getSimpleName());
                System.out.println("bisa terbang");
                System.out.println("makan:");
                ((Bird) bisaTerbang).eat();
                System.out.println();
            }
        }
    }
}