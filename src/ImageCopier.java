import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ImageCopier {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


//    public static String gettingPath (String inputRequest) {
//        File wayFile;
//        String wayPath = "";
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            while (true) {
//                System.out.println(inputRequest);
//                wayPath = scanner.nextLine();
//                wayFile = new File(wayPath);
//                break;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(ANSI_RED + "Картинка не найдена или не существует," +
//                    " попробуйте еще раз!" + ANSI_RESET);
//        }
//
//        return wayPath;
//    }

    protected static void copyFileUsingStream(String source, String dest) {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[2^100];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            } System.out.println(ANSI_BLUE + "\nКопирование успешно выполнено!" + ANSI_RESET);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
