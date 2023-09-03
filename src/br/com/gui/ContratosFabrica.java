package br.com.gui;

public class ContratosFabrica extends Fabrica {
    @Override
    Carro recuperarCarro(String solicitacao) {
        switch (solicitacao) {
            case "A":
                return new AudiCarro(230, "Gasolina", "Preto");
            case "B":
                return new MecedesCarro(210, "Gasolina", "Branco");
            case "C":
                return new TeslaCarro(150, "Eletricidade", "Cinza");
            default:
                System.out.println("Infelizmente o carro solicitado não estava disponível");
                return null;
        }
    }
}
