package operações;

public class Principal{
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        
        int resultadoSoma = soma.calcular(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);
        
        int resultadoSubtracao = subtracao.calcular(10, 7);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}








