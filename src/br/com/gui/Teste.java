package br.com.gui;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("C", true);
        Fabrica fabrica = getSemContratosFabrica(cliente);
        Carro carro1 = fabrica.criar(cliente.getPedido());
        carro1.ligarMotor();

    }
    private static Fabrica getSemContratosFabrica(Cliente cliente) {
        if (cliente.isContratoEmpresa()) {
            return new ContratosFabrica();
        } else {
            return new SemContratosFabrica();
        }
    }
}
