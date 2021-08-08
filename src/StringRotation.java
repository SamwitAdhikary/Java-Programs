public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        if (str1.length() != str2.length()) {
            System.out.println("Not String Rotation");
        } else {
            str1 = str1.concat(str1);
            if (str1.indexOf(str2) != -1) {
                System.out.println("String Rotation");
            } else {
                System.out.println("Not String Rotation");
            }
        }
    }

}
