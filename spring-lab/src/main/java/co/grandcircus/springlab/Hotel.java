package co.grandcircus.springlab;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hotels")
public class Hotel {
    @Id
    private String id;
    private String hotelName;
    private String city;
    private int pricePerNight;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPricePerNight() {
        return this.pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Hotel() {
    }

    public Hotel(String id, String hotelName, String city, int pricePerNight) {
        this.id = id;
        this.hotelName = hotelName;
        this.city = city;
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", hotelName='" + getHotelName() + "'" +
            ", city='" + getCity() + "'" +
            ", pricePerNight='" + getPricePerNight() + "'" +
            "}";
    }

}
 