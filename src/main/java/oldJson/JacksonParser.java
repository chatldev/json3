package oldJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JacksonParser {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<String> type = new ArrayList<>();
        ArrayList<String> type2 = new ArrayList<>();
        ArrayList<String> type3 = new ArrayList<>();
        try {
            Donut[] staff = mapper.readValue(new File("json.json"), Donut[].class);

            for (int i = 0; i < staff.length; i++) {
                List<Addition> topping = staff[i].getTopping();

                for (int j = 0; j < topping.size(); j++) {
                    System.out.print(topping.get(j).getType()+", ");
                    type.add(topping.get(j).getType());
                }
                System.out.println();
            }
            //      String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            //      System.out.println(prettyStaff1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
