
package folharh;


public abstract class Funcionario {
    private String nome, cpf, endereco, telefone, setor;
    
    //Cosntrutor
    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    
    
    // Getters e setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    // métodos abstratos para calculo de pagamento e aplicação de aumento
    
    public abstract double calcularPagamento();
    
    public abstract void aplicarAumento(double percentual);
    
    //método concreto de visualização de dados
    
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Setor: "+setor);
    }
    
    
}
