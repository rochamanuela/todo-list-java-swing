package com.todolist.view;

import javax.swing.*;
import com.todolist.view.components.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    
    public MainFrame() {
        super("App To Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 630);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        getContentPane().setLayout(null);

        Button btnEntrar = new Button();
        btnEntrar.setText(null);
        btnEntrar.setBounds(422, 333, 100, 38);
        getContentPane().add(btnEntrar);

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
                dispose();
            }
        });

        Button btnCadastrar = new Button();
        btnCadastrar.setText(null);
        btnCadastrar.setBounds(532, 333, 152, 38);
        getContentPane().add(btnCadastrar);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroFrame cadastroFrame = new CadastroFrame();
                cadastroFrame.setVisible(true);
                dispose();
            }
        });

        JLabel wallpaperLabel = new JLabel();
        ImageIcon wallpaperIcon = new ImageIcon(getClass().getResource("/com/todolist/view/images/main_light.png")); // Verifique o caminho correto aqui
        wallpaperLabel.setIcon(wallpaperIcon);
        wallpaperLabel.setBounds(0, 0, 900, 600);
        getContentPane().add(wallpaperLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
