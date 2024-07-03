package EPAM_INTERNAL_ROUNDS;

public class Addresses {

    private String id ;
    private String city;
    private int zipcode ;


    public Addresses(String id, String city, int zipcode) {
        this.id = id;
        this.city = city;
        this.zipcode = zipcode;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
