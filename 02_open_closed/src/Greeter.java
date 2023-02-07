import java.util.Objects;

public class Greeter{

    public String greet(IFormality iFormality) {

        return iFormality.greet();
//        if (Objects.equals(this.formality, "formal")) {
//            return "Good evening";
//        } else if (Objects.equals(this.formality, "casual")) {
//            return "Goodday?";
//        } else if (Objects.equals(this.formality, "intimate")) {
//            return "Hello darling!";
//        } else {
//            return "Hello.";
//        }
    }
}
