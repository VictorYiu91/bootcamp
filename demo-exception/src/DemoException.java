public class DemoException {
    // ! Method Author need to handle all exception cases
    // ! Method -> either return or throw
    // ! For "throw", it is throwing  an exception object
    public static int methodA(String s1, String s2) {
        if (s1 == null || s2 == null)
            throw new RuntimeException("s1 and s2 should not be null."); // ! 死因
        // Business logic (happy flow)
        if (s1.length() > s2.length())
            return methodB(s1);
        else
            return methodB(s2);
    }

    public static int methodB(String x) {
        if (x.length() > 3) {
            return "hello".length();
        } else {
            return "goodbye".length();
        }
    }

    public static void main(String[] args) {
        // int result = methodA("Lucas Chan", "Steven Wong");

        // int result = methodA(null, "Steven Wong"); // You (Method user)
        // -> ! try to call methodA
        try {
            int result = methodA("Lucas", "Steven Wong");
            System.out.println("result=" + result);
        } catch(RuntimeException e) { 
            // 1. handle 死因報告, e is the exception object
            // 2. recovery
            System.out.println("The returned exception is well received.");
            System.out.println("The root cause is " + e.getMessage());
        }
        // Happy flow: line 29,30
        // Exception flow: line 29,31,34,35
    }
}

