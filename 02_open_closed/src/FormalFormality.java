public class FormalFormality implements IFormality{

    String formality = "formal";
    @Override
    public String greet() {
        return "Good evening";
    }

    @Override
    public String getFormality() {
        return this.formality;
    }
}
