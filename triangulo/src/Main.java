import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String Lado1 = JOptionPane.showInputDialog("Insira o comprimento do lado 1:");
        float lado1 = Float.parseFloat(Lado1);
        String Lado2 = JOptionPane.showInputDialog("Insira o comprimento do lado 2:");
        float lado2 = Float.parseFloat(Lado2);
        String Lado3 = JOptionPane.showInputDialog("Insira o comprimento do lado 3:");
        float lado3 = Float.parseFloat(Lado3);

        if (verificarTriangulo(lado1, lado2, lado3)){
            triangulo triangulo = new triangulo(lado1, lado2, lado3);

            JOptionPane.showMessageDialog(null, "Tipo do triângulo: " + triangulo.tipoTriangulo());
            JOptionPane.showMessageDialog(null, "O perímetro do triângulo é: " + triangulo.calcularPerimetro());
            JOptionPane.showMessageDialog(null, "A área do triângulo é: " + triangulo.calcularArea());
        }
        else {
            JOptionPane.showMessageDialog(null, "Os lados fornecidos não validam um triângulo.");
        }
    }

    public static boolean verificarTriangulo(float lado1, float lado2, float lado3) {
        //verifica se a soma de dois lados é maior que o terceiro lado
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
