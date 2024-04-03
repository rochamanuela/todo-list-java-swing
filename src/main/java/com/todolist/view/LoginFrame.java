package com.todolist.view;

import javax.swing.*;
import com.todolist.view.components.Button;
import com.todolist.view.components.Input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    
    public LoginFrame() {
        super("App To Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 630);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        getContentPane().setLayout(null);

        Input inputNickname = new Input(null);
        inputNickname.setBounds(100, 297, 260, 38);
        getContentPane().add(inputNickname);
        
        Input inputSenha = new Input(null);
        inputSenha.setBounds(100, 378, 260, 38);
        getContentPane().add(inputSenha);

        Button btnEntrar = new Button();
        btnEntrar.setText(null);
        btnEntrar.setBounds(89, 452, 280, 38);
        getContentPane().add(btnEntrar);

        // adicionar aqui, neste "método", a lógica de verificação do usuário e 
        // senha antes de redirecionar o usuário para a tela home
        btnEntrar.addActionListener(new ActionListener() {
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
        ImageIcon wallpaperIcon = new ImageIcon(getClass().getResource("/com/todolist/view/images/login.png"));
        wallpaperLabel.setIcon(wallpaperIcon);
        wallpaperLabel.setBounds(0, 0, 900, 600);
        getContentPane().add(wallpaperLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
        });
    }
}
