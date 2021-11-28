
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class JacksonParser2 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Colors colors = mapper.readValue(new File("json2.json"), Colors.class);
            System.out.println(colors);
            //      String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            //      System.out.println(prettyStaff1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
