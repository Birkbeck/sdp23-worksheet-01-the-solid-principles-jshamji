public class IntimateFormality implements IFormality{
    String formality = "intimate";
    @Override
    public String greet() {
        return "Hello darling!";
    }

    @Override
    public String getFormality() {
        return this.formality;
    }
}
