package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro ("Book One", 250);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String name;
    private Integer numPages;

    public Livro() {
    }

    public Livro(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(name, livro.name) && Objects.equals(numPages, livro.numPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numPages);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
