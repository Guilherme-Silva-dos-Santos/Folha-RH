
package folharh;


public class Horista extends Funcionario{
    private double horasTrabalhadas, valorHora;
   
    //construtor
    public Horista(String nome, String cpf, String endereco, String telefone, String setor,double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    
    //Getters e settters

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    // calculo do pagamento
    @Override
    public double calcularPagamento(){
        return horasTrabalhadas * valorHora;
    }
    
    // aumento no valor da hora
    @Override
    public void aplicarAumento(double percentual){
        valorHora += valorHora * (percentual / 100);
    }
    
}
