/**
 * Main
 *
 * @author Asiel Leal Celdeiro
 */
public class Main {

    public static void main(String[] args) {
        DefaultModel model = new DefaultModel();
        model.setName("name");
        System.out.println(model);
        model.setAge(null);
        System.out.println(model);
        model.setAge("");
        System.out.println(model);
    }
}
