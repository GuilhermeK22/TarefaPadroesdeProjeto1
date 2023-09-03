package br.com.gui;

public class SemContratosFabrica extends Fabrica{
    @Override
    Carro recuperarCarro(String solicitacao) {
        switch (solicitacao) {
            case "A":
                return new FiatCarro(75, "Gasolina", "Vermelho");
            case "B":
                return new ChevroletCarro(55, "Gasolina", "Azul");
            case "C":
                return new VolkswagenCarro(70, "Gasolina", "Prata");
            default:
                System.out.println("Infelizmente o carro solicitado não estava disponível");
                return null;
        }
    }
}