import jdk.nashorn.internal.lookup.MethodHandleFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MicroBlogApp {

    static final Logger log = LoggerFactory.getLogger(MicroBlogApp.class.getName());

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter text");
        String input = console.nextLine();
        log.debug(input);

        MicroBlog mb = new MicroBlog();
        mb.truncate(input);

    }
}
