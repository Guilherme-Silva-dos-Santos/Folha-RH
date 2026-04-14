
package folharh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FolhaRh {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        
        //laço para listar os funcionários
        for (int i = 0; i < 10; i++) {
            
            System.out.println("\nFuncionário "+(i+1));
            System.out.println("Tipo (1 - Assalariado, 2 - Horista, 0 - Sair)");
            int tipo = entrada.nextInt();
            entrada.nextLine(); //"comendo" o enter 
            
            if(tipo == 0) break;
            
            //informando e preenchendo dados comuns
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            
            System.out.println("CPF: ");
            String cpf = entrada.nextLine();
            
            System.out.println("Endereço: ");
            String endereco = entrada.nextLine();
            
            System.out.println("Telefone: ");
            String telefone = entrada.nextLine();
            
            System.out.println("Setor: ");
            String setor = entrada.nextLine();
            
            //criando os objetos
            if (tipo == 1){
                System.out.println("Salário: ");
                double salario = entrada.nextDouble();
                
                lista.add(new Assalariado(salario,nome,cpf,endereco,telefone,setor));
            }else if(tipo ==2){
                System.out.println("Horas trabalhadas: ");
                double horasTrabalhadas = entrada.nextDouble();
                
                System.out.println("Valor da hora: ");
                double valorHora = entrada.nextDouble();
                
                lista.add(new Horista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora));
            }
            
            entrada.nextLine(); //limpando o buffer
        }
        
        // mostrando dados e pagamento
        
        System.out.println("\n----DADOS DOS FUNCIONARIOS----");
        for(Funcionario f : lista){
            f.mostrarDados();
            System.out.println("Pagamento: "+ f.calcularPagamento());
            System.out.println("----------------------------");
        }
        
        // aplicando aumento
        System.out.println("\nInforme o percentual de aumento: ");
        double percentual = entrada.nextDouble();
        
        for(Funcionario f : lista){
            f.aplicarAumento(percentual);
        }
        
        // Mostrando novamente
        System.out.println("\n----AUMENTO ADICIONADO----");
        for(Funcionario f : lista){
            f.mostrarDados();
            System.out.println("Novo Pagamento: "+f.calcularPagamento());
            System.out.println("----------------------------");
        }
        
        entrada.close();
    }
    
}
