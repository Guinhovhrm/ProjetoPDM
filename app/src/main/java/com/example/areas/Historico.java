package com.example.areas;

public class Historico {

    public Historico(int idHisto, String tipConta, float val1, float val2, float val3, float resultado) {
        this.setIdHist(idHist);
        this.setTipConta(tipConta);
        this.setVal1(val1);
        this.setVal2(val2);
        this.setVal3(val3);
        this.setResultado(resultado);
    }
    public Historico(int historicoCod, String historicoTpConta, int historicoVal1, int historicoVal2, int historicoVal3, int idHist, float pontuação){
        this.setIdHist(idHist);
        setPontuacao(pontuacao);
    }

    @Override
    public String toString() {
        return "Historico{" +
                "idHist=" + idHist +
                ", tipConta='" + tipConta + '\'' +
                ", val1=" + val1 +
                ", val2=" + val2 +
                ", val3=" + val3 +
                ", resultado=" + resultado +
                '}';
    }

    private int idHist;
    private String tipConta;
    private float val1;
    private float val2;
    private float val3;
    private float resultado;
    private float pontuacao;

    //ID USUARIO
    //SET ID Usuario
    protected int getIdHist(){
        return idHist;
    }
    //get Id historico
    protected void setIdHist(int idHist){
        this.idHist = idHist;
    }
    //Tip conta
    //get tipconta
    protected String getTipConta(){
        return tipConta;
    }
    //set tipconta
    protected void setTipConta(String tipConta){
        this.tipConta = tipConta;
    }

    //valor1
    //get valor 1
    protected float getVal1(){
        return val1;
    }
    //set valor 1
    protected void setVal1(float val1){
        this.val1 = val1;
    }

    //valor 2
    //get valor 2
    protected float getVal2(){
        return val2;
    }
    //set valor 2
    protected void setVal2(float val2){
        this.val2 = val2;
    }

    //valor 3
    //get valor 3
    protected float getVal3(){
        return val3;
    }
    //set valor 3
    protected void setVal3(float val3){
        this.val3 = val3;
    }

    //resultado
    //get resultado
    protected float getResultado(){
        return resultado;
    }
    //set resultado
    protected void setResultado(float resultado){
        this.resultado = resultado;
    }
    protected  float getPontuacao() { return pontuacao; }
    protected void setPontuacao(float pontuacao) { this.pontuacao = pontuacao; }

}