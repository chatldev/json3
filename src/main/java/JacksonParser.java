import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class JacksonParser {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Donut[] staff = mapper.readValue(new File("json.json"), Donut[].class);
            System.out.println(Arrays.toString(staff));
            //      String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            //      System.out.println(prettyStaff1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
