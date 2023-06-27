import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa("titulo", LocalDate.now());
        System.out.println(tarefa.getDataCadastro());
    }
}