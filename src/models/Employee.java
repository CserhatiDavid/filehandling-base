package models;

import java.time.LocalDate;

public class Employee {
    int id;
    String name;
    String mothersName;
    String city;
    String address;
    int netto;
    int rewards;
    LocalDate entry;
    LocalDate birthDate;
    String birthPlace;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMothersName() {
        return mothersName;
    }
    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNetto() {
        return netto;
    }
    public void setNetto(int netto) {
        this.netto = netto;
    }
    public int getRewards() {
        return rewards;
    }
    public void setRewards(int rewards) {
        this.rewards = rewards;
    }
    public LocalDate getEntry() {
        return entry;
    }
    public void setEntry(LocalDate entry) {
        this.entry = entry;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getBirthPlace() {
        return birthPlace;
    }
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
}
