
package folharh;


public class Assalariado extends Funcionario {
    private double salario;
    
    //construtor

    public Assalariado(double salario, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }
    
    //Getters e Setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //calculo pagamento assalariado
    @Override
    public double calcularPagamento(){
        return salario;
    }
    
    // aplicando aumento
    @Override
    public void aplicarAumento(double percentual){
        salario += salario * (percentual / 100);
    }
    
}
