package desafio01;

import java.util.Objects;

public class Animal {
    private String especie;
    private String alimentacao;
    private Double tamanho;
    private Integer peso;

    public Animal(String especie, String alimentacao, Double tamanho, Integer peso) {
        this.especie = especie;
        this.alimentacao = alimentacao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(especie, animal.especie) && Objects.equals(alimentacao, animal.alimentacao) && Objects.equals(tamanho, animal.tamanho) && Objects.equals(peso, animal.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, alimentacao, tamanho, peso);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }
}
