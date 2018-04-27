import java.io.IOException;

public class Model implements IModel{

    @Override
    public String getHelloWordl() throws IOException {
        return DAOHelloWorld.getInstance().readFile();
    }
}
