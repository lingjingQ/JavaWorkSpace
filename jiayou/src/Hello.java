import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Hello {
    public static void main(String[] args) throws IOException {
        FileOutputStream os = new FileOutputStream("aa.txt");
        os.write("lakjsfdaklj".getBytes());

    }
}
