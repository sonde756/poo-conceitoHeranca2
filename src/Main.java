public class Main {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();


        v1.setNome("Hudson");
        v1.setSexo("Homi");
        v1.setIdade(12);
        v1.fazerAniversario();

        System.out.println(v1.toString());
    }
}