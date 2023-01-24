public class CasualFormality implements IFormality{

    String formality = "casual";
    @Override
    public String greet() {
        return "Goodday?";
    }

    @Override
    public String getFormality() {
        return this.formality;
    }
}
