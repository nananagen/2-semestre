public class Poupança extends Conta
{    
    public void rendimento(double taxaJuros)
    {
        if(taxaJuros >= 0 && taxaJuros <= 1)
        {
            depositar( saldo * (taxaJuros));
        }
    }
}
