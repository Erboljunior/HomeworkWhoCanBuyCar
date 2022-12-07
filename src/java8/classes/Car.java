package java8.classes;

import java8.enums.Colour;
import java8.enums.Country;

import java.math.BigDecimal;
import java.time.Year;

public class Car {
    private String name;
    private String mark;
    private BigDecimal price;
    private Year releaseYear;
    private Colour colour;
    private Country countryOgOrigin;

    public Car(String name, String mark, BigDecimal price, Year releaseYear, Colour colour, Country countryOgOrigin) {
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.releaseYear = releaseYear;
        this.colour = colour;
        this.countryOgOrigin = countryOgOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Country getCountryOgOrigin() {
        return countryOgOrigin;
    }

    public void setCountryOgOrigin(Country countryOgOrigin) {
        this.countryOgOrigin = countryOgOrigin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", releaseYear=" + releaseYear +
                ", colour=" + colour +
                ", countryOgOrigin=" + countryOgOrigin +
                '}';
    }
}
