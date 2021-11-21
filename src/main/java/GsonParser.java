import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class GsonParser {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader("json.json")) {

            // Convert JSON File to Java Object
            Donut[] staff = gson.fromJson(reader, Donut[].class);

            // print staff
            System.out.println(Arrays.toString(staff));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
