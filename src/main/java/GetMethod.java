import java.io.File;

public class GetMethod {
    static void getMethod(File f) {

        File[] innerFile = f.listFiles();

        try{
            assert innerFile != null;
            for (File file : innerFile) {
                if (file.isDirectory()) {
                    System.out.println("______________________________________________________________________________");
                    System.out.println(file.getAbsolutePath() + " is directory");
                    getMethod(file);
                } else {
                    System.out.println(file.getAbsolutePath() + " is file");

                }
            }
        }catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }
    }
}


