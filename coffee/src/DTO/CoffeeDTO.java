package DTO;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class CoffeeDTO implements Serializable,Comparable<String> {

    private String type;
    private String price;
    private String quantity;
    private String farmer;
    private String location;

    public CoffeeDTO(String type,String price,String quantity,String farmer,String location){
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.farmer = farmer;
        this.location = location;
    }

    @Override
    public boolean equals(Object o){
        if(o==null || getClass() != o.getClass())
            return false;
        CoffeeDTO that = (CoffeeDTO) o;
        return type == that.type && price == that.price && quantity == that.quantity && farmer == that.farmer && location == that.location;
    }

    @Override
    public int hashCode(){
        return Objects.hash(type,price,quantity,farmer,location);
    }

    @Override
    public String toString() {
        return "CoffeeDTO{" +
                "Type=" + type +
                ", Price=" + price +
                ", Quantity=" + quantity +
                ", Farmer=" + farmer +
                ", Location=" + location +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
