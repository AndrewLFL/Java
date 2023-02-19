public class Conta
{
    //atributos
    private int numConta;
    private String tipo;
    private double dinheiroAtual;
    private String dono;
    private boolean status;


//methods personalizados

    public void abrirConta(String t)
    {
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC")
        {
            this.setDinheiroAtual(50);
        }
        else if(t == "CP")
        {
            this.setDinheiroAtual(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta()
    {
        if(this.getDinheiroAtual() < 0)
        {
            System.out.println("Conta não pode ser fechada porque está em débito!");
        }
        else if (this.getDinheiroAtual() > 0 )
        {
            System.out.println("Conta não pode ser fechada pois possui saldo!");
        }
        else
        {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }


    public void depositar(double deposito)
    {
        if (this.isStatus())
        {
            this.setDinheiroAtual(this.getDinheiroAtual() + deposito);
            System.out.println("Deposito de " + deposito + " realizado na conta do " + getDono());
        }
        else
        {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(double saque)
    {
        if (this.isStatus())
        {
            if (getDinheiroAtual() >= saque)
            {
                this.setDinheiroAtual(getDinheiroAtual() - saque);
                System.out.println("Saque de " + saque + " realizado na conta do " + getDono());
            }
            else
            {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        else
        {
            System.out.println("Impossivel sacar em uma conta fechada");
        }
    }

    public void pagarMensal()
    {
        int v = 0;
        if (this.getTipo() == "CC")
        {
            v = 12;
        }
        else if(this.getTipo() == "CP")
        {
            v = 20;
        }
        if (isStatus())
        {
            this.setDinheiroAtual(this.getDinheiroAtual() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        }
        else
        {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

    public void statusConta()
    {
        System.out.println("Conta: " + getNumConta() +
                "\nDinheiro atual: " + getDinheiroAtual() +
                "\nTipo da conta: " + getTipo() +
                "\nDono da conta: " + getDono() +
                "\nStatus da conta: " + isStatus());
    }

    //Metodos Especiais

    public Conta()
    {
        this.setStatus(false);
        this.setDinheiroAtual(0);
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        if(tipo!="CP" && tipo!="CC")
        {
            System.out.println("\nErro você escolheu um tipo de conta invalida! ");
        }
        else
        {
            this.tipo = tipo;
        }
    }

    public String getDono() {
        return dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDinheiroAtual(double dinheiroAtual) {
        this.dinheiroAtual = dinheiroAtual;
    }

    public double getDinheiroAtual() {
        return dinheiroAtual;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
