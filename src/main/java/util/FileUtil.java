package util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
//import java.util.stream.Stream;

/**
 * Created by zhangshuyi1 on 2018/5/2.
 */
public class FileUtil {
    public static String readFile(String filePath) throws IOException {

//        Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8);
//        stream.forEach(System.out::println);
        return null;
    }

    public static void main(String[] args) throws Exception{
//        readFile("E:\\JD Edit\\a");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-ww-dd HH:mm:ss");
        String str= "2018-02-29 17:00:00";
        System.out.println(sdf.parse(str));
        System.out.println(sdf2.parse(str));

    }
}