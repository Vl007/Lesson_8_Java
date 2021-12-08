import java.io.File;


public class Main {

    public static void main(String[] args) {

        final File SOURCE = new File("C://Users/Vladimir/Downloads/snow.png");
        final File DESC = new File("D://Program Files/Vladimir/Study Java/Lesson 8/src/images/snow-image3.png");
        ImageCopier.copyFileUsingStream(SOURCE, DESC);
    }
}
