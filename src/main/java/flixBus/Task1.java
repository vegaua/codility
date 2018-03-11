package flixBus;

public class Task1 {

    static String isPangram(String[] strings) {
        String pangrams = "";
        for(String line: strings) {
            pangrams += isPangram(line) ? 1 : 0;
        }
        return pangrams;
    }

    static boolean isPangram(String line) {
        if(line.length() < 26) return false;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char letter : alphabet) {
            if(!line.contains(String.valueOf(letter))) {
                return false;
            }
        }

        return true;
    }
}
