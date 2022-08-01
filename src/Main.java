import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Gustavo: \n" + devGustavo.getConteudosInscritos());
        System.out.println();
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Conteúdos inscritos de Gustavo: \n" + devGustavo.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteúdos concluídos de Gustavo: \n" + devGustavo.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: " + devGustavo.calcularTotalXP());
        System.out.println();

        Dev devAleatorio = new Dev();
        devAleatorio.setNome("Aleatório");
        devAleatorio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Aleatório: \n" + devAleatorio.getConteudosInscritos());
        System.out.println();
        devAleatorio.progredir();
        System.out.println("Conteúdos inscritos de Aleatório: \n" + devAleatorio.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteúdos concluídos de Aleatório: \n" + devAleatorio.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: " + devAleatorio.calcularTotalXP());
        System.out.println();
    }
}
