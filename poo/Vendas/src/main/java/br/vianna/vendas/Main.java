package br.vianna.vendas;

import br.vianna.vendas.model.Produto;
import br.vianna.vendas.model.e.EEstado;
import br.vianna.vendas.model.impl.IVA;
import br.vianna.vendas.model.impl.ICMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        System.out.println("Bem vindo");
        Produto prod = new Produto();
        System.out.println("Nome: ");
        prod.setNome( le.nextLine() );
        System.out.println("Preco custa: ");
        prod.setPreco( le.nextDouble() );
        prod.addImposto( new IVA() );
        System.out.println("Estado :");
        String est = le.next().toUpperCase();
        prod.addImposto( new ICMS(EEstado.valueOf(est)) );

        System.out.println("Preco Final R$ "+prod.precoVenda());

    }
}