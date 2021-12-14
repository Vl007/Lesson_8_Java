import java.io.File;
import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {

       String s1, s2;

       s1 = args[0];
       s2 = args[1];
       ImageCopier.copyFileUsingStream(s1, s2);


//       String SOURCE = "C://Users/Vladimir/Downloads/snow.png";
//       String DESC = "D://Program Files/Vladimir/Study Java/Lesson 8/src/images/snow-image424.png";
//       ImageCopier.copyFileUsingStream(SOURCE, DESC);

//        String pathName = ImageCopier.gettingPath("Введите адрес пути и название картники, где она лежит!");
//        String newPathName = ImageCopier.gettingPath("Введите новое имя название картники!");
//
//        ImageCopier.copyFileUsingStream(pathName, newPathName);

    }
}
