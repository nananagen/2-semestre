import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Carro extends Veiculo {
    private Date horaEntrada = new Date();
    private Date horaSaida = new Date();
    private long diffInMillis = horaSaida.getTime() - horaEntrada.getTime();
    private long diffInHours = TimeUnit.MILLISECONDS.toHours(diffInMillis);
    private double valorFinal;
    public Carro(String placa, String modelo, Date horaEntrada, Date horaSaida) {
        super(placa, modelo, horaEntrada, horaSaida);
    }

    public long CalcaTempo() {
        LocalDateTime entrada = LocalDateTime.ofInstant(getHoraEntrada().toInstant(), ZoneId.systemDefault());
        LocalDateTime saida = LocalDateTime.ofInstant(getHoraSaida().toInstant(), ZoneId.systemDefault());

        Duration duracao = Duration.between(entrada, saida);

        long diffInHours = duracao.toHours();

        return diffInHours;
    }

    public double calcValorCarro()
    {
        long diffInHours = CalcaTempo();
        valorFinal = diffInHours * 7.00;
        System.out.print("Hora da entrada: " + horaEntrada);
        System.out.print("Hora da Saída: " + horaSaida);
        System.out.print("Total Hora: " + diffInHours);
        System.out.print("Valor a ser pago: " + valorFinal);
        return valorFinal;
    }

}