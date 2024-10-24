public class Carro {
    private String cor;
    private String marca;
    private String modelo;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;

    }

    public String getMarca(){
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String cor){
        this.cor=cor;
    }

    public void imprimir(){
        System.out.println("A cor do carro é"+cor);

    }

}