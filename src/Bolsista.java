public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno: "+ this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()+"é bolsita, pagamento com desconto!");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa=" + bolsa +
                '}';
    }
}
