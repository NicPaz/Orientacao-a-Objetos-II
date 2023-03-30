public class ExemploExcecao {
    public static void main(String[] args) {
        ExemploExcecao ee = new ExemploExcecao();
        ee.calcular();
    }

    // método sempre se escreve com letra minúscula
    public void calcular(){
        try {
            float res;
            OperacoesMatematicas op = new OperacoesMatematicas();
            res = op.dividir(3, 2);
            System.out.println(res);
            res = op.dividir(3, 0);
            System.out.println(res);
        } catch (DivisaoPorZero e) {
            System.out.println("Não é possível dividir um número por 0.");
        }
    }
    
}
