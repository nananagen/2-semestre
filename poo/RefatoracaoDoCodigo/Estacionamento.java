import java.util.ArrayList;

public class Estacionamento
{
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    Veiculo veiculo1 = new Veiculo();
    protected int qtdVagas = 50;
    public Estacionamento ()
    {

    }

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public  void adicionaCarro()
    {
        Carro carro1 = new Carro(veiculo1.getPlaca(), veiculo1.getModelo(), veiculo1.getHoraEntrada(), null);
        addVeiculo(carro1); 
    }

    public void adicionaMoto()
    {
        Moto moto1 = new Moto(veiculo1.getPlaca(), veiculo1.getModelo(), veiculo1.getHoraEntrada(), null);
        addVeiculo(moto1); 
    }

    public  void adicionaCaminhao()
    {
        Caminhao caminhao1 = new Caminhao(veiculo1.getPlaca(), veiculo1.getModelo(), veiculo1.getHoraEntrada(), null);
        addVeiculo(caminhao1);
    }

}
