package github;

public class StringHandlingDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "AIET";
        String str2 = "Mangalore";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 of str1: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "AIET";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "Welcome to AIET, Mangalore";
        System.out.println("Contains 'AIET': " + sentence.contains("AIET"));
        System.out.println("Index of 'Mangalore': " + sentence.indexOf("Mangalore"));

        // 5. Substring Operations
        System.out.println("Substring from index 11: " + sentence.substring(11));
        System.out.println("Substring (11 to 15): " + sentence.substring(11, 15));

        // 6. String Modification
        String modified = sentence.replace("Mangalore", "Karnataka");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   AIET Campus   ";
        System.out.println("Original with spaces: '" + withSpaces + "'");
        System.out.println("After trim(): '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String fullString = str1.concat(" - ").concat(str2);
        System.out.println("Concatenated String: " + fullString);

        // 9. String Splitting
        String courses = "CSE,ECE,MECH,CIVIL";
        String[] courseArray = courses.split(",");
        System.out.println("Courses offered:");
        for (String course : courseArray) {
            System.out.println(course);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to ");
        sb.append("AIET");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Ravi";
        int marks = 95;
        String result = String.format("Student: %s, Marks: %d", name, marks);
        System.out.println("Formatted String: " + result);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "student@aiet.edu";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
        System.out.println("Email: " + email);
        System.out.println("Is Valid Email: " + isValid);
    }
}

