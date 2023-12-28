import java.util.Vector;

public class VectorSample {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<Integer>();
        vc.add(1);
        vc.add(2);
        System.out.println(vc.toString());
        System.out.println(vc.capacity());
    }
}
