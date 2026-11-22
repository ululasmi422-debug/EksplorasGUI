import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JLabel labelNama, labelNim, hasil;
    JTextField inputNama, inputNim;
    JButton tombolSimpan;
    JPanel panel, panelInput, panelTombol;

    Main() {
        setTitle("Form Data Mahasiswa");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(2, 2, 10, 12));

        labelNama = new JLabel("Nama:");
        inputNama = new JTextField(15);

        labelNim = new JLabel("NIM:");
        inputNim = new JTextField(15);

        panelInput.add(labelNama);
        panelInput.add(inputNama);
        panelInput.add(labelNim);
        panelInput.add(inputNim);

        tombolSimpan = new JButton("Simpan");
        hasil = new JLabel("Silakan masukkan data", JLabel.CENTER);

        panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTombol.add(tombolSimpan);

        tombolSimpan.addActionListener(this);

        panel.add(panelInput, BorderLayout.NORTH);
        panel.add(panelTombol, BorderLayout.CENTER);
        panel.add(hasil, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nama = inputNama.getText();
        String nim = inputNim.getText();

        hasil.setText("Nama: " + nama + " | NIM: " + nim);
    }

    public static void main(String[] args) {
        new Main();
    }
}