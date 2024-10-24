public class Veiculos {
    public String nome;
    public String modelo;
    public int velocidade;

    public Veiculos(String nome,String modelo,int velocidade){
        this.nome=nome;
        this.modelo=modelo;
        this.velocidade=velocidade;

    }

    public void ExibirDetalhes(){
        System.out.println("NOME:"+nome);
        System.out.println("MODELO"+modelo);
        System.out.println("VELOCIDADE"+velocidade);

    }







}
