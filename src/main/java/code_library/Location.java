package code_library;

public class Location {
    public String city;
    public String country;
    public String region;

    public Location(String city, String country, String region) {
        this.city = city;
        this.country = country;
        this.region = region;
    }

    public Location() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
