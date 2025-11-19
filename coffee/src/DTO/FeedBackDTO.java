package DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
@Getter @Setter
public class FeedBackDTO implements Serializable,Comparable<String> {

    private String name;
    private String email;
    private String comments;
    private String rating;

    public FeedBackDTO(String name,String email, String comments,String rating){
        this.name = name;
        this.email = email;
        this.comments = comments;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FeedBackDTO that = (FeedBackDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(comments, that.comments) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, comments, rating);
    }

    @Override
    public String toString() {
        return "FeedBackDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comments='" + comments + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
