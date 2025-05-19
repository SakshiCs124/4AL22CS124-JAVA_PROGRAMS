package github;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3 (case-sensitive): " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Index of 'fox': " + sentence.indexOf("fox"));
        System.out.println("Contains 'dog': " + sentence.contains("dog"));

        // 5. Substring Operations
        System.out.println("Substring (4, 9): " + sentence.substring(4, 9));

        // 6. String Modification
        String replaced = sentence.replace("fox", "cat");
        System.out.println("Replaced 'fox' with 'cat': " + replaced);

        // 7. Whitespace Handling
        String messy = "   Trim me!   ";
        System.out.println("Original: '" + messy + "'");
        System.out.println("Trimmed: '" + messy.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder();
        sb.append("Java ");
        sb.append("StringBuilder ");
        sb.append("Example");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Validate Email
        String email = "test@example.com";
        boolean isValid = email.contains("@") && email.startsWith("test") && email.endsWith(".com");
        System.out.println("Email '" + email + "' is valid: " + isValid);
    }
}
