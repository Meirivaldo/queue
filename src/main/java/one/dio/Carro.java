package one.dio;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //testa se o objeto é igual, se for retorna true!
        if (o == null || getClass() != o.getClass()) return false; // testa se o objeto é diferente ( != ), se for retorna false!
        Carro carro = (Carro) o; //cria o objeto carro para o teste se é igual o outro!
       return Objects.equals(marca, carro.marca);
     //   return true; //Se não tiver como "COMENTADO // " comparando,
                     //qualquer objeto carro vai retornar verdadeiro!
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
