class triangulo {
    float lado1;
    float lado2;
    float lado3;

    //utilizado construtor para inicializar os comprimentos dos lados do triângulo
    triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    float calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    float calcularArea() {
        float s = (this.lado1 + this.lado2 + this.lado3) / 2.0f;
        float area = (float) Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
        return area;
    }

    //tipo do triângulo(equilátero/isósceles/escaleno)
    String tipoTriangulo() {
        if (this.lado1 == this.lado2 && this.lado1 == this.lado3) {
            return "Equilátero";
        } else if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
}