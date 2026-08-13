package src.br.com.meusistema.main;
import src.br.com.meusistema.model.Carro;
public class Sistema {
    public static void main(String[] args) {
    System.out.println("Iniciando o sistema...");
// Criando o objeto (Construindo o Carro 1)
    Carro meuCarro = new Carro();
    meuCarro.setModelo("Fusca");
    meuCarro.setCor("Azul");
    meuCarro.setVelocidade(-500); // Tentando hackear novamente
// Chamando o método (Comportamento)
    meuCarro.buzinar();
    }
}