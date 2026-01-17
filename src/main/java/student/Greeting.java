package student;

/*
 * This class is a placeholder which you will fully implement based on the javadoc
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */

/**
 * Greeting holds the locality of the greeting, the greeting itself, and the format in which
 * the greeting is to be printed.
 *
 * <p>
 * The greeting class is simple acts as a container for the information of location,
 * the ascii and unicode strings of the greeting, along with formatted in which the greeting
 * should be printed.
 * </p>
 *
 */

public class Greeting {
    /** Holds the integer localityID. */
    private int localityID;
    /** Holds the name of the locality. */
    private String localityName;
    /** Holds the ASCII greeting. */
    private String asciiGreeting;
    /** Holds the unicode greeting. */
    private String unicodeGreeting;
    /** Holds the name of a person, immutable. */
    private String name;
    /** Holds the format in which the greeting will be displayed. */
    private String formatStr;
    /** String value of the DEFAULT_GREETING with class scope. */
    private static final String DEFAULT_GREETING = "Hello";
    /** String value of the DEFAULT_FORMAT with class scope. */
    private static final String DEFAULT_FORMATSTR = "%s, %%s!";

    /**
     * Greeting that creates a greeting with ascii and unicode characters.
     * It makes no assumptions and everything needs to be provided.
     * Other constructors call this very detailed constructor.
     *
     * @param localityID int, ID of the locality.
     * @param localityName string, locality.
     * @param asciiGreeting string, ASCII greeting.
     * @param unicodeGreeting string, Unicode greeting.
     * @param formatStr string, format of the greeting with %%s for name.
     */
    public Greeting(int localityID, String localityName,
                    String asciiGreeting,
                    String unicodeGreeting,
                    String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Greeting that creates a greeting with ASCII and Unicode characters
     * assuming the language is already using ascii letters only. It also
     * assumes the format of the greeting to be "{greeting}, {name}!"
     *
     * @param localityID - int, id of the locality
     * @param localityName - string, name of the locality
     * @param greeting - string, greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, DEFAULT_FORMATSTR);
    }

    /**
     * Default greeting that creates "Hello, {name}!".
     * @param localityID - int, id of the locality.
     * @param localityName - string, name of the locality
     *
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, DEFAULT_GREETING, DEFAULT_GREETING, DEFAULT_FORMATSTR);
    }

    /**
     * This is a private method for Greeting class that returns the locality id number.
     * @return int, localityID.
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * This is a private method for Greeting class that returns the string locality.
     * @return string, locality name.
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ASCII greeting. Just the greeting, no formatting.
     * @return string, greeting in ASCII encoding.
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the Unicode greeting. Just the greeting, no formatting.
     * @return string, greeting in Unicode encoding.
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     * This string will have a %s, so that the name can be inserted into the
     * greeting in the correct location.
     * @return the format string with the greeting inserted into the format.
     * @see #getFormatStr(boolean asciiOnly)
     */
    public String getFormatStr() {
        return String.format(this.formatStr, getUnicodeGreeting());
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     * This string will have a %s, so that the name can be inserted into the
     * greeting in the correct location.
     * @param asciiOnly -  if true, only ASCII characters will be used.
     * @return format string with the greeting inserted into the format.
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, getAsciiGreeting());
        }
        return this.getFormatStr();
    }

    /**
     * Returns the full greeting details as a string.
     * Primarily for debugging purposes.
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, "
            + "localityName:\"%s\", "
            + "asciiGreeting:\"%s\", "
            + "unicodeGreeting:\"%s\"}",
            this.getLocalityID(), this.getLocalityName(),
            this.getAsciiGreeting(), this.getUnicodeGreeting());
    }
    // main method for example usage, to be deleted before submission
//    public static void main(String[] args) {
//        Greeting g1 = new Greeting(1, "USA", "HELLO",
//                "hello", "%s, %%s!");
//        //System.out.println(g1.getLocalityID()); // prints 1
//        //System.out.println(g1.getLocalityName()); // prints US
//        //System.out.println(g1.getFormatStr()); // prints "hello, %s!"
//        //System.out.println(g1.getFormatStr(true)); // prints "HELLO, %s!"
//        //System.out.println(g1.getFormatStr(false)); // prints "hello, %s!"
//        String name = "Alice";
//        System.out.println(g1);
//        String greet = String.format(g1.getFormatStr(), name);
//        System.out.println(greet); // prints hello, Alice!
//        System.out.println(String.format(g1.getFormatStr(true), name));
//        // prints "HELLO, Alice"
//    }
}
