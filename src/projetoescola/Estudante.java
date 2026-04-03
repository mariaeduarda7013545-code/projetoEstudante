package projetoescola;

public class Estudante{

//Atributos
    public String nome;
    public double idade;
    public String matricula;
    public String endereco;
    
   //Funções
    public void estudar(){
        System.out.println(nome + " está estudando!");
    }
 
    public void realizarAtividades(){
        System.out.println(nome + " está fazendo algo!");
    }
 
    public void sofrer(){
        System.out.println(nome + " está chorando...");
    }
 
    public void realizarProvas(){
        System.out.println(nome + " está fazendo prova!");
    } 
    
    public void imprimir(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Endereço: "+ endereco);
    } 
}
