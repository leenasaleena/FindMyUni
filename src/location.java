public class location {
    private String country;
    private String city;
    private String streetAddress;
    private String postalCode;
    private String area;

    //constructor

    public location(String country, String streetAddress,
                    String city, String postalCode, String area) {
            this.country = country;
            this.streetAddress = streetAddress;
            this.city = city;
            this.postalCode = postalCode;
            this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
