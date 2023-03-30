public class OperacoesMatematicas {
    
    public float somar(float num1, float num2){
        return num1 + num2;
    }

    public float substrair(float num1, float num2){
        return num1 - num2;
    }

    public float multiplicar(float num1, float num2){
        return num1 * num2;
    }

    public float dividir(float num1, float num2) throws DivisaoPorZero{
        if(num2 == 0){
            throw new DivisaoPorZero();
        }
        return num1/num2;
    }
}
