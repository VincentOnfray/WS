import java.io.IOException;

public class Model implements IModel{

    @Override
    public String getHelloWorld() throws IOException {
        return DAOHelloWorld.getInstance().readFile();
    }
}
