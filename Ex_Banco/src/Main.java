import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        Conta c = new Conta();
        System.out.println("Digite o seu nome para abrir a conta: ");
        c.setDono(scan.nextLine());
        c.setNumConta(001);
        System.out.println("\nDigite:\n1 - Conta Corrente\n2 - Conta Poupança\n ");
        int tipo = scan.nextInt();
        switch (tipo)
        {
            case 1:
                c.abrirConta("CC");
                break;
            case 2:
                c.abrirConta("CP");
                break;
        }
        do
        {
            System.out.println("\nDigite:" +
                    "\n0 - Sair" +
                    "\n1 - Depositar dinheiro" +
                    "\n2 - Sacar dinheiro " +
                    "\n3 - Mostrar o status da conta" +
                    "\n4 - Pagar mensalidade" +
                    "\n5 - Fechar a conta\n");
            i = scan.nextInt();
            if (i==0)
                break;
            switch (i)
            {
                case 1:
                    System.out.println("Insira o valor que deseja depositar: ");
                    double deposito = scan.nextDouble();
                    c.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja sacar: ");
                    double saque = scan.nextDouble();
                    c.sacar(saque);
                    break;
                case 3:
                    c.statusConta();
                    break;
                case 4:
                    c.pagarMensal();
                    break;
                case 5:
                    c.fecharConta();
                    break;
                default:
                    System.out.println("Digite uma das opções validas!");
                    break;
            }
        }
        while(i != 0);
    }
}