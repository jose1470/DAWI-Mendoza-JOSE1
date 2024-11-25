package pe.edu.i202220865.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")

public class CountryLanguague {

    @Id
   private String CountryCode;
    private String Language;
    private String IsOfficial;
    private Double Percentage;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Code")
    private Country country;


    public CountryLanguague() {
    }

    public CountryLanguague(String countryCode) {
        CountryCode = countryCode;
    }

    public CountryLanguague(String countryCode, String language, String isOfficial, Double percentage, Country country) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryLanguague{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                ", country=" + country +
                '}';
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }
}
