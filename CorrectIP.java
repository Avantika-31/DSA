public class CorrectIP {
    public static String correctIPv4(String s) {

        // Check for invalid characters
        for (char c : s.toCharArray()) {
            if (!(Character.isDigit(c) || c == '.')) {
                return "Error";
            }
        }

        String[] parts = s.split("\\.", -1);

        // Must have exactly 4 octets
        if (parts.length != 4) {
            return "Error";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 4; i++) {

            if (parts[i].isEmpty()) {
                return "Error";
            }

            // Remove leading zeros
            int j = 0;
            while (j < parts[i].length() - 1 && parts[i].charAt(j) == '0') {
                j++;
            }

            ans.append(parts[i].substring(j));

            if (i != 3) {
                ans.append(".");
            }
        }

        return ans.toString();
    }
    public static void main(String[] args){
        String s="122.005.13.09";
        System.out.println(correctIPv4(s));
    }
}
