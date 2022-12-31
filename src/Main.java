import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        List<String> palavras = new ArrayList<>();

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichael = new Dev();
        devMichael.setNome("Michael");
        devMichael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Michael:" +devMichael.getConteudosInscritos());
        devMichael.progredir();
        devMichael.progredir();
        devMichael.progredir();
        System.out.println("Conteúdos inscritos de Michael:" +devMichael.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Michael:" +devMichael.getConteudosConcluidos());
        System.out.println("XP de Michael:" +devMichael.calcularTotalXp());


        System.out.println("-------------------------------------------------------------------------");

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Guilherme:" +devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("Conteúdos inscritos de Guilherme:" +devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Guilherme:" +devGuilherme.getConteudosConcluidos());
        System.out.println("XP de Guilherme:" +devGuilherme.calcularTotalXp());
    }
}