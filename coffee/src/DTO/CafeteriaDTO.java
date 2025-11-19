package DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
@Getter @Setter
public class CafeteriaDTO implements Serializable,Comparable<String> {

    private String name;
    private String location;
    private String type;
    private String price;
    private String franchise;
    private String owner;
    private String gst;

    public CafeteriaDTO(String name,String location,String type,String price,String franchise,String owner,String gst){
        this.name = name;
        this.location = location;
        this.type = type;
        this.price = price;
        this.franchise = franchise;
        this.owner = owner;
        this.gst = gst;
    }

    @Override
    public String toString() {
        return "CafeteriaDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", franchise='" + franchise + '\'' +
                ", owner='" + owner + '\'' +
                ", gst='" + gst + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CafeteriaDTO that = (CafeteriaDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(type, that.type) && Objects.equals(price, that.price) && Objects.equals(franchise, that.franchise) && Objects.equals(owner, that.owner) && Objects.equals(gst, that.gst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, type, price, franchise, owner, gst);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
