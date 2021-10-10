import java.io.File;

public class Main {
    public static void main(String[] args) {

        final String dir = System.getProperty("user.dir");
        File f = new File(dir);
        GetMethod.getMethod(f);
    }
}

