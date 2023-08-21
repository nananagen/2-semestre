import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Main
{

    public static void main (String[] args)
    {    
    }

    public static void Menu()
    {
        Scanner leitura = new Scanner (System.in);
        Veiculo veiculo1 = new Veiculo();
        Estacionamento estacionamento1 = new Estacionamento();
        int menu;    
        System.out.println("### Menu Princípal ###");
        System.out.println("1 - Cadastro de Veículos");
        System.out.println("2 - Saída de veículos");
        System.out.println("3 - Departamento Pessoal");
        System.out.println("4 - Departamento Financeiro");
        menu = leitura.nextInt();
        switch(menu) {
            case 1:
                System.out.println("Selecionado: Cadastro de Veículos");
                CadastraVeiculo();
                Menu();
                break;
            case 2:
                System.out.println("Selecionado: Saída de Veículos");
                Menu();
                break;
            case 3:
                System.out.println("Selecionado: Departamento Pessoal");
                Menu();
                break;
            case 4:
                System.out.println("Selecionado: Departamento Financeiro");
                Menu();
                break;
            default:
                System.out.println("Opção inválida");
                Menu();
                break;
        }
    }

    public static void CadastraVeiculo()
    {
        Estacionamento estacionamento1 = new Estacionamento();
        Scanner leitura = new Scanner (System.in);
        int i=0;
        String menu="";
        System.out.println("Tipo do veículo \n 1-Carro \n 2-Moto \n 3-Caminhão");
        menu = leitura.next();
        while (i <estacionamento1.qtdVagas)
        {
            Veiculo veiculo1 = new Veiculo();
            if(menu.equalsIgnoreCase("1"))
            {

                System.out.print("Selecionado: Carro \n");

                System.out.print("Placa: ");
                veiculo1.setPlaca(leitura.next());

                System.out.print("Modelo: ");
                veiculo1.setModelo(leitura.next());

                LocalDateTime horaEntrada = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                System.out.println("Hora de entrada: " + horaEntrada.format(formatter));
                System.out.println("Vaga utilizada: " + i);
                estacionamento1.add(veiculo(veiculo1.getPlaca(),veiculo1.getModelo(),horaEntrada,null));

                i++;
                System.out.println("Deseja adicionar mais um veículo? S/N(Voltar para o menu principal)");
                menu = leitura.next();
                if(menu.equalsIgnoreCase("S"))
                {
                    CadastraVeiculo();
                }
            }

            if(menu.equalsIgnoreCase("2"))
            {
                System.out.print("Selecionado: Moto \n");

                System.out.print("Placa: ");
                veiculo1.setPlaca(leitura.next());

                System.out.print("Modelo: ");
                veiculo1.setModelo(leitura.next());

                LocalDateTime horaEntrada = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                System.out.println("Hora de entrada: " + horaEntrada.format(formatter));
                System.out.println("Vaga utilizada: " + i);
                estacionamento1.adicionaMoto();

                i++;
                System.out.println("Deseja adicionar mais um veículo? S/N(Voltar para o menu principal)");
                menu = leitura.next();
                if(menu.equalsIgnoreCase("S"))
                {
                    CadastraVeiculo();
                }

            }

            if(menu.equalsIgnoreCase("3"))
            {
                System.out.print("Selecionado: Caminhão \n");

                System.out.print("Placa: ");
                veiculo1.setPlaca(leitura.next());

                System.out.print("Modelo: ");
                veiculo1.setModelo(leitura.next());

                LocalDateTime horaEntrada = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                System.out.println("Hora de entrada: " + horaEntrada.format(formatter));
                System.out.println("Vaga utilizada: " + i);
                estacionamento1.adicionaCaminhao();
                i++;
                System.out.println("Deseja adicionar mais um veículo? S/N(Voltar para o menu principal)");
                menu = leitura.next();
                if(menu.equalsIgnoreCase("S"))
                {
                    CadastraVeiculo();
                }
            }
        }
    }
}