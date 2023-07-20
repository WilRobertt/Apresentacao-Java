package carro;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro("SUV");
        Caminhao caminhao = new Caminhao("Volvo");

        verificarVeiculo4x4(carro);
        verificarVeiculo4x4(caminhao);
    }

    private static void verificarVeiculo4x4(Object objeto) {
        if (objeto instanceof Veiculo4x4) {
            System.out.println("O veículo é 4x4.");
        } else {
            System.out.println("O veículo NÃO é 4x4.");
        }
    }
	}


