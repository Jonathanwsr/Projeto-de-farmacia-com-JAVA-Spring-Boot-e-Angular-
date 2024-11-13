package zonetech.farmacia.enity;


import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

            private Long id;

    String name;
    String description;
    String fabricante;
    String category;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFabricante() {
        return fabricante;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public Produto orElseThrow(Object o) {
        return null;
    }
}