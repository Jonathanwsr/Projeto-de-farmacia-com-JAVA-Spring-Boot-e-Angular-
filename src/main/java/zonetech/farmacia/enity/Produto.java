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
    String brcode;
    String tradeName;
    String FormPharmaceutical;
    String anvisaregistration;
    String Concentration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getBrcode() {
        return brcode;
    }

    public void setBrcode(String brcode) {
        this.brcode = brcode;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getFormPharmaceutical() {
        return FormPharmaceutical;
    }

    public void setFormPharmaceutical(String formPharmaceutical) {
        FormPharmaceutical = formPharmaceutical;
    }

    public String getAnvisaregistration() {
        return anvisaregistration;
    }

    public void setAnvisaregistration(String anvisaregistration) {
        this.anvisaregistration = anvisaregistration;
    }

    public String getConcentration() {
        return Concentration;
    }

    public void setConcentration(String concentration) {
        Concentration = concentration;
    }

    public Produto orElseThrow(Object o) {
        return null;
    }
}