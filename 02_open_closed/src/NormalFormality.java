public class NormalFormality implements IFormality{

    String formality = "normal";
    @Override
    public String greet() {
        return "Hello.";
    }

    @Override
    public String getFormality() {
        return this.formality;
    }
}
