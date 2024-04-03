package com.todolist.view;

import javax.swing.*;
import com.todolist.view.components.Button;
import com.todolist.view.components.Input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFrame extends JFrame {
    
    public CadastroFrame() {
        super("App To Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 630);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        getContentPane().setLayout(null);

        Input inputNome = new Input(null);
        inputNome.setBounds(520, 246, 260, 38);
        getContentPane().add(inputNome);
        
        Input inputNickname = new Input(null);
        inputNickname.setBounds(520, 327, 260, 38);
        getContentPane().add(inputNickname);
        
        Input inputSenha = new Input(null);
        inputSenha.setBounds(520, 408, 260, 38);
        getContentPane().add(inputSenha);

        Button btnCadastrar = new Button();
        btnCadastrar.setText(null);
        btnCadastrar.setBounds(511, 482, 280, 38);
        getContentPane().add(btnCadastrar);

        // adicionar aqui, neste "método", a lógica de verificação dos 
        // dados de cadastro antes de redirecionar o usuário para a tela home
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeFrame homeFrame = new HomeFrame();
                homeFrame.setVisible(true);
                dispose();
            }
        });

        Button btnVoltar = new Button();
        btnVoltar.setText(null);
        btnVoltar.setBounds(30, 530, 40, 40);
        getContentPane().add(btnVoltar);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
                dispose();
            }
        });

        JLabel wallpaperLabel = new JLabel();
        ImageIcon wallpaperIcon = new ImageIcon(getClass().getResource("/com/todolist/view/images/cadastro.png"));
        wallpaperLabel.setIcon(wallpaperIcon);
        wallpaperLabel.setBounds(0, 0, 900, 600);
        getContentPane().add(wallpaperLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastroFrame frame = new CadastroFrame();
            frame.setVisible(true);
        });
    }
}
