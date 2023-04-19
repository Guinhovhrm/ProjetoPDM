package com.example.areas;

public class Cal {

    public float CalQuadrado(float lado) {
        //pegar o resultado escrito pelo usuriario como parametro pra altura e base
        //String lado = it.getStringExtra("lado");
        float result = lado * lado;
        return result;
        //TxtVar.setText("A area do quadrado é:" + result);
    }

    public float CalTriangulo(float altura, float base) {
        //String base = it.getStringExtra("base");
        //String altura = it.getStringExtra("altura");
        float result = (altura * base) / 2;
        return result;
        //TxtVar.setText("A area do triangulo é:" + result);
    }

    public double CalTrianguloEquil(float lado) {
        //String lado = it.getStringExtra("lado");
        double result = (lado * lado * Math.sqrt(3)) / 4;
        //TxtVar.setText("A area do trinagulo equilatero é:" + result);
        return result;
    }

    public double CalHexagono(float lado) {
        //String lado = it.getStringExtra("lado");
        double result = (6 * lado * lado * Math.sqrt(3)) / 2;
        //TxtVar.setText("A area do hexagono é:" + result);
        return result;
    }

    public float CalRetangulo(float altura, float base) {
        //String base = it.getStringExtra("base");
        //String altura = it.getStringExtra("altura");
        float result = altura * base;
        //TxtVar.setText("A area do retangulo é:" + result);
        return result;
    }

    public float Caltrapezio(float altura, float baseMe, float baseMa) {
        //String altura = it.getStringExtra("altura");
        //String baseMe = it.getStringExtra("baseMe");
        //String baseMa = it.getStringExtra("baseMa");
        float result = ((baseMe + baseMa) / 2) * altura;
        //TxtVar.setText("A area do trapezio é:" + result);
        return result;
    }

    public double CalCirculo(float raio) {
        //String raio = it.getStringExtra("raio");
        double result = Math.PI * (raio * raio);

        //TxtVar.setText("A area do circulo é:" + result);
        return result;

    }
}
