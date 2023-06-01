package com.example.areas;

public class Usuario {

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, int pontuacaoUsuario) {
        this.setIdUsuario(idUsuario);
        this.setNomeUsuario(nomeUsuario);
        this.setPontuacaoUsuario(pontuacaoUsuario);
    }

    public Usuario(String nomeUsuario, int pontuacaoUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.pontuacaoUsuario = pontuacaoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nomeUsuario='" + nomeUsuario + '\'' + ", pontuacaoUsuario=" + pontuacaoUsuario + '}';
        //"Usuario{idUsuario=1, nomeUsuario=Ronan, pontuacaoUsuario=30}"
    }

    private int idUsuario;
    private String nomeUsuario;
    private int pontuacaoUsuario;



    protected int getIdUsuario() {
        return idUsuario;
    }

    protected void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    protected String getNomeUsuario() {
        return nomeUsuario;
    }

    protected void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    protected int getPontuacaoUsuario() {
        return pontuacaoUsuario;
    }

    protected void setPontuacaoUsuario(int pontuacaoUsuario) {
        this.pontuacaoUsuario = pontuacaoUsuario;
    }
}