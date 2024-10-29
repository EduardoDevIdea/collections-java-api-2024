package main.java.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoconvite;

    public Convidado(String nome, int codigoconvite) {
        this.nome = nome;
        this.codigoconvite = codigoconvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoconvite() {
        return codigoconvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoconvite() == convidado.getCodigoconvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoconvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoconvite=" + codigoconvite +
                '}';
    }
}
