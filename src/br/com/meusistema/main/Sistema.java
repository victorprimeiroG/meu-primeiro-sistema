package src.br.com.meusistema.main;
import src.br.com.meusistema.model.Carro;
public class Sistema {
    public static void main(String[] args) {
    System.out.println("Iniciando o sistema...");
// Criando o objeto (Construindo o Carro 1)
    Carro meuCarro = new Carro();
    meuCarro.modelo = "Fusca";
    meuCarro.cor = "Azul";
// Chamando o método (Comportamento)
    meuCarro.buzinar();
    }
}