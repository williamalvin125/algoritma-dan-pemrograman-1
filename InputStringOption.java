import javax.swing.JOptionPane;

public class InputStringOption {

    public static void main (String[] args) {

        String nama = JOptionPane.showInputDialog("Masukkan nama Anda : ");
        String nrp = JOptionPane.showInputDialog("Masukkan NRP Anda : ");
        String message = "Nama anda adalah " +nama;
        String nrpmu = "NRP Anda adalah " +nrp;
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, nrpmu);
    }
}