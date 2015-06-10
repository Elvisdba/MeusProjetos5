package sistemadevendas;

import javax.swing.JFrame;

import javax.swing.JButton;

public class SistemadeVendas {
    JFrame janela = new JFrame();
    JButton botao = new JButton("OK");
   
    public static void main(String[] args) {
        SistemadeVendas sistemadeVendas = new SistemadeVendas();
    }
    private SistemadeVendas(){
        //define o titulo da janela
        janela.setTitle("Sistema de java");
        
        //define a largura e altura da janela
        janela.setSize(400,300);
        
        //define a posição da janela na tela
        janela.setLocation(50,50);
        
        //define que ao fechar a janela, encerre a aplicação
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adiciona o botão
        janela.add(botao);
        
        //mostramos a janela
        janela.setVisible(true);
    }
    
}
