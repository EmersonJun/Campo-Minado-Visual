package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.text.TabExpander;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("unused")
public class PainelTabuleiro extends JPanel{
    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(
            tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

        tabuleiro.registrarObservador(e -> {
            //mostrar resultado ao usuario

            tabuleiro.reinicar();
        });
    }
}
