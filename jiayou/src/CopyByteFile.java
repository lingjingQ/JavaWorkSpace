import java.io.*;

public class CopyByteFile {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        int len = 0;
        byte[] bs = new byte[2];
        while((len = bis.read(bs))!= -1){
            System.out.print(new String(bs,0,len));
        }
    }
}
