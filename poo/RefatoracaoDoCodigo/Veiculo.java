import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

public class Veiculo {
    Scanner leitura = new Scanner (System.in); 

    private Date horaEntrada = new Date();
    private Date horaSaida = new Date();
    protected Cliente donoDoCarro;
    protected String placa;
    protected String modelo;

    public Veiculo() 
    {

    }

    public Veiculo(String placa, String modelo, Date horaEntrada, Date horaSaida) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    
}

