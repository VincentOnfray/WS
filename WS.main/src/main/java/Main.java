import java.io.IOException;

public class Main{
    public static void main(String Args[]) throws IOException {
        Model model = new Model();
        View view = new View();

        Controller control = new Controller(view, model);
        control.run();


    }
}
