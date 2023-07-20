package operações;

public class Soma implements OperacaoMatematica {
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}