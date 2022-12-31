package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(){}

    public double getCargaHoraria() {
        return XP_PADRAO * cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
