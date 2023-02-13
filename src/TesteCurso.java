import java.time.LocalDate;

public class TesteCurso{

public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Cursoi java Iniciante");
        cursoJava.setDescricao("Curso para iniciante em java");
        cursoJava.setCargaHoraria(80);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Como usar IDE INTELLIJ");
        mentoriaJava.setDescricao("Aprenda sobre uma Das maiores do java");
        mentoriaJava.setData(LocalDate.now());

        BootCamp bootcampOrangeInter = new BootCamp();
        bootcampOrangeInter.setNome("Bootcamp orange inter");
        bootcampOrangeInter.setDescricao("Neste bootcamp vai aprender java");
        bootcampOrangeInter.getConteudos().add(cursoJava);


        System.out.println("---------------------------------------------");

        Dev devCarlaLinda = new Dev();
        devCarlaLinda.setNome("Carla");
        devCarlaLinda.inscreverBootcamp(bootcampOrangeInter);
        System.out.println("Conteudos");
        devCarlaLinda.progredir();
        System.out.println("Lista");
        System.out.println("Conteudos inscritos" + devCarlaLinda.getConteudoInscritos());

       devCarlaLinda.getConteudoInscritos();
        System.out.println("Conteudos inscritos" + devCarlaLinda.getConteudoInscritos());
         System.out.println("XP: " + devCarlaLinda.calcularTotalXp());
        System.out.println("---------------------------------------------------------------------");
        

    }
}
