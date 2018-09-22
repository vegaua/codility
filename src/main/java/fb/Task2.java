package fb;

public class Task2 {

    static String compressedString(String message) {
        String compressedString = "";
        for (int letterIndex = 0; letterIndex < message.length(); letterIndex++) {
            String letter = String.valueOf(message.toCharArray()[letterIndex]);
            int letterCounter = 0;
            while (letterIndex + letterCounter + 1 <= message.length() &&
                    letter.equals(String.valueOf(message.toCharArray()[letterIndex + letterCounter]))) {
                letterCounter++;
            }
            letterIndex = (letterCounter == 0) ? letterIndex : letterIndex + letterCounter -1;
            compressedString += letter + ((letterCounter > 1) ? letterCounter : "");
        }

        return compressedString;
    }
}
