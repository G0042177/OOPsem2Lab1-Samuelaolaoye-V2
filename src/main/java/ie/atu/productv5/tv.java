package ie.atu.productv5;

public class tv extends Product {

    private String screensize;
    private String manufacture ;

    public tv() {
        super();
        screensize = "";
        manufacture = "";
        count++;
    }
    
    
    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getScreensize() {
        return screensize;
    }
    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " " + manufacture;
    }
}