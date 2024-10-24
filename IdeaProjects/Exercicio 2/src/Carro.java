public class Carro extends Veiculos{

    int numPortas;

    public Carro(String nome,String modelo,int velocidade,int numPortas){
        this.nome=nome;
        this.modelo=modelo;
        this.velocidade=velocidade;
        this.numPortas=numPortas;
    }


    public void ExibirDetalhes(){
        System.out.println("NOME: "+nome);
        System.out.println("MODELO: "+modelo);
        System.out.println("VELOCIDADE: "+velocidade);
        System.out.println("NUMERO TOTAL DE PORTAS: "+numPortas);
    }



}
