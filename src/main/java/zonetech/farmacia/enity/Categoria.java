package zonetech.farmacia.enity;

import javax.persistence.*;
import java.util.List;


@Entity

@Table(name = "categoria")

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)





    private Long id;
    private String  Analgesicos;
    private String  Comesticos;
    private String  HigienePessoal;
    private String  Medicamentos;
    private String  Perfumaria ;
    private String  Maquiagem;
    private String  ProdutosparaBebes;
    private String  CuidadosComAPele;
    private String  SuplementosAlimentares;
    private String  AlimentosEspeciais;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String  AntiInflmatorios;

    public String getAnalgesicos() {
        return Analgesicos;
    }

    public void setAnalgesicos(String analgesicos) {
        Analgesicos = analgesicos;
    }

    public String getComesticos() {
        return Comesticos;
    }

    public void setComesticos(String comesticos) {
        Comesticos = comesticos;
    }



    public String getHigienePessoal() {
        return HigienePessoal;
    }

    public void setHigienePessoal(String higienePessoal) {
        HigienePessoal = higienePessoal;
    }

    public String getMaquiagem() {
        return Maquiagem;
    }

    public void setMaquiagem(String maquiagem) {
        Maquiagem = maquiagem;
    }

    public String getPerfumaria() {
        return Perfumaria;
    }

    public void setPerfumaria(String perfumaria) {
        Perfumaria = perfumaria;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        Medicamentos = medicamentos;
    }

    public String getProdutosparaBebes() {
        return ProdutosparaBebes;
    }

    public void setProdutosparaBebes(String produtosparaBebes) {
        ProdutosparaBebes = produtosparaBebes;
    }

    public String getAlimentosEspeciais() {
        return AlimentosEspeciais;
    }

    public void setAlimentosEspeciais(String alimentosEspeciais) {
        AlimentosEspeciais = alimentosEspeciais;
    }


    public String getCuidadosComAPele() {
        return CuidadosComAPele;
    }

    public void setCuidadosComAPele(String cuidadosComAPele) {
        CuidadosComAPele = cuidadosComAPele;
    }

    public String getSuplementosAlimentares() {
        return SuplementosAlimentares;
    }

    public void setSuplementosAlimentares(String suplementosAlimentares) {
        SuplementosAlimentares = suplementosAlimentares;
    }

    public String getAntiInflmatorios() {
        return AntiInflmatorios;
    }

    public void setAntiInflmatorios(String antiInflmatorios) {
        AntiInflmatorios = antiInflmatorios;
    }
}
