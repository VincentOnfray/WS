public class Main{
    public static void main(String Args[]){
        Model model = new Model();
        View view = new View();

        Controller control = new Controller(view, model);

    }
}
