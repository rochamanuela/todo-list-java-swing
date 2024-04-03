package com.todolist.view;

import javax.swing.*;
import com.todolist.view.components.Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame extends JFrame {

    public HomeFrame() {
        super("App To Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 630);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        getContentPane().setLayout(null);

        Button btnSair = new Button();
        btnSair.setText(null);
        btnSair.setBounds(815, 30, 48, 20);
        getContentPane().add(btnSair);

        // falta adicionar a lógica que irá encerrar a sessão antes de levar para a tela
        // inicial
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
                dispose();
            }
        });

        // falta adicionar a lógica que irá levar para a tela de criação de uma nova
        // lista
        Button btnCriarNovaLista = new Button();
        btnCriarNovaLista.setText(null);
        btnCriarNovaLista.setBounds(738, 515, 122, 38);
        getContentPane().add(btnCriarNovaLista);

        btnCriarNovaLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
                dispose();
            }
        });

        JLabel nomeUsuarioLabel = new JLabel("Manuela Rocha"); // deverá receber o nome do usuário que vem do banco
        nomeUsuarioLabel.setFont(new Font("Arial", Font.BOLD, 24));
        nomeUsuarioLabel.setForeground(new Color(38, 50, 56));
        nomeUsuarioLabel.setBounds(98, 29, 400, 50);
        getContentPane().add(nomeUsuarioLabel);

        JLabel wallpaperLabel = new JLabel();
        ImageIcon wallpaperIcon = new ImageIcon(getClass().getResource("/com/todolist/view/images/home.png"));
        wallpaperLabel.setIcon(wallpaperIcon);
        wallpaperLabel.setBounds(-7, 0, 900, 600);
        getContentPane().add(wallpaperLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HomeFrame frame = new HomeFrame();
            frame.setVisible(true);
        });
    }
}
