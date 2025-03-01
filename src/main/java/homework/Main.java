package homework;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("Valid phone numbers:");
            PhoneNumberValidator.validatePhoneNumbers("src/main/resources/phones.txt");


            System.out.println("\nConverting users to JSON...");
            UserFileConverter.convertToJson("src/main/resources/users.txt", "src/main/resources/user.json");
            System.out.println("Users have been converted to user.json");


            System.out.println("\nWord frequencies:");
            WordFrequencyCounter.countWordFrequency("src/main/resources/words.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}