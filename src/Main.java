public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Estudar Java", false);
        Task task2 = new Task("Subir projeto no GitHub", true);

        task1.exibir();
        task2.exibir();
    }
}
