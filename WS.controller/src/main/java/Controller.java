import java.io.IOException;

public class Controller {
    private final Iview view;
    private final IModel model;

    public Controller(Iview view, IModel model){
        this.view = view;
        this.model = model;

    }

    public void run() throws IOException {
                this.view.displayMessage(this.model.getHelloWorld());
    }
}
