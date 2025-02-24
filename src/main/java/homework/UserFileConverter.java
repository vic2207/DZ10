package homework;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserFileConverter {
    public static void convertToJson(String inputFile, String outputFile) throws IOException {
        List<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String header = reader.readLine(); // Пропускаємо заголовок
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    User user = new User(parts[0], Integer.parseInt(parts[1]));
                    users.add(user);
                }
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(outputFile), users);
    }

    public static void main(String[] args) throws IOException {
        String inputFile = UserFileConverter.class.getClassLoader().getResource("file.txt").getPath();
        convertToJson(inputFile, "src/main/resources/user.json");

    }

}
