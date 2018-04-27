import java.io.*;

public class DAOHelloWorld {
    private static DAOHelloWorld ourInstance = new DAOHelloWorld();
    private String FileName = "C:\\Users\\blenn\\Desktop\\eXia\\UE5\\txt.txt";
    private String Message;

    public static DAOHelloWorld getOurInstance() {
        return ourInstance;
    }

    public static void setOurInstance(DAOHelloWorld ourInstance) {
        DAOHelloWorld.ourInstance = ourInstance;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public static DAOHelloWorld getInstance() {

        return ourInstance;
    }

    private DAOHelloWorld() {
    }
    public  String readFile() throws IOException {
        FileReader fr = new FileReader(FileName);
        BufferedReader br = new BufferedReader(fr);
        this.Message = br.readLine();
        System.out.println(this.getMessage());
        return this.getMessage();

    }
}
