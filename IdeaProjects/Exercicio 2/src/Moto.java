public class Moto extends Veiculos {

    int cilindradas;


    public Moto(String nome, String modelo, int velocidade, int cilindradas) {
        this.nome = nome;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.cilindradas = cilindradas;

    }

    public void ExibirDetalhes() {
        System.out.println("NOME:" + nome);
        System.out.println("MODELO" + modelo);
        System.out.println("VELOCIDADE: " + velocidade);
        System.out.println("CILINDRADAS: " + cilindradas);


    }

}
