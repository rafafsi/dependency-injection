package com.dio.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    @Autowired //diz pro framework que se trata de uma injecao
    private Veiculo veiculo; //instancia da interface passada como uma dependency injection

    public Condutor(Veiculo obj) { //constructor da interface condutor pra receber o obj do veiculo
        this.veiculo = obj;
    }

    public void automovel() { //metodo da classe condutor que recebe a acao da interface pra dizer qual automovel que se trata o novo obj
        veiculo.action();
    }
}
