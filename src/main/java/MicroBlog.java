import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class MicroBlog {

    private final Logger log = LoggerFactory.getLogger(MicroBlog.class.getName());

    public String truncate(String input) {
        byte[] bytes = input.getBytes(Charset.forName("UTF-16"));

        log.debug("in truncate method : " + bytes.length);

        int maxLength = 5;

        int minLength = 1;

        String output = new String(bytes, StandardCharsets.UTF_16);
        log.debug(output);

        if (input.getBytes().length < minLength) {
            log.debug(String.valueOf(input.getBytes().length));
            return "Please enter at least one character";
        }

        else if(input.getBytes().length <= maxLength) {
            log.debug(String.valueOf(input.getBytes().length));
            return output;
        }

        output = (output.substring(0,5));
        log.debug(output);

        return output;

//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
