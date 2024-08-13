package com.codedemonbr.launch;

import com.codedemonbr.launch.devices.AparelhoTelefonico;
import com.codedemonbr.launch.devices.NavegadorInternet;
import com.codedemonbr.launch.devices.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Double statusBateria;

    public Iphone(Double status) {
//        this.statusBateria = status;
        setStatusBateria(status);
    }


    public void desbloquearTela() {
        System.out.println("Tela desbloqueada");
    }


    @Override
    public void tocar() {
        System.out.println("seu telefone está tocando uma música...");
    }

    @Override
    public void pausar() {
        System.out.println("seu telefone pausou a música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("seu telefone selecionou a música.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para... " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Foi possível atender, a ligação foi enviada para caixa de mensagem.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo uma página da web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando uma nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando uma página da web");

    }

    public Double getStatusBateria() {
        return statusBateria;
    }

    public void setStatusBateria(Double statusBateria) {
        if (statusBateria < 100.0 && statusBateria >= 0.0) {
            this.statusBateria = statusBateria;
        } else {
            this.statusBateria = 0.0;
        }
    }
}
