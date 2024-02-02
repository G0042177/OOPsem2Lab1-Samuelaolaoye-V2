package ie.atu.productv5;

public class music extends Product {

    private String artist;
    private String label;

    public music() {
        super();
        artist = "";
        label = "";
        count++;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setLabel(String label) {
        this.label = label;
    }


    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}
