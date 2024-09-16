public class ContaBanco {

    private int numeroConta;
    private String Agencia;
    private String NomeCliente;
    private long saldoConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return Agencia;
    }



    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public long getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(long saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void menssagemBoasVindas (){
        System.out.println("Olá "+ getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + getAgencia() + ", conta " + getNumeroConta() + " e seu saldo de R$ " + getSaldoConta() +
                " já está disponível para saque.");
    }
}
