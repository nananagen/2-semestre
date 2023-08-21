import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Caminhao extends Veiculo {
    private Date horaEntrada = new Date();
    private Date horaSaida = new Date();
    private long diffInMillis = horaSaida.getTime() - horaEntrada.getTime();
    private long diffInHours = TimeUnit.MILLISECONDS.toHours(diffInMillis);
    double valorCaminhao;
    public Caminhao(String placa, String modelo, Date horaEntrada, Date horaSaida) {
        super(placa, modelo, horaEntrada, horaSaida);
    }
    /*
    public double calcValorCaminhao()
    {
    valorCaminhao = diffInHours * 9.00; 
    System.out.print("Hora da entrada: " + horaEntrada);
    System.out.print("Hora da Saída: " + horaSaida);
    System.out.print("Total Hora: " + diffInHours);
    System.out.print("Valor a ser pago: " + valorCaminhao);
    return valorCaminhao;
    } */
}  