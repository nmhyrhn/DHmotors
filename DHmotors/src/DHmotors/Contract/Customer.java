package DHmotors.Contract;

public class Customer {
    private String name;
    private String releaseDate;

    public Customer(String name, String releaseDate) {


        this.name = name;
        this.releaseDate = releaseDate;
    }


    public String getName() { return name; }
    public String getReleaseDate() { return releaseDate; }
}
