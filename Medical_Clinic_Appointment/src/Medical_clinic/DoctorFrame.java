package Medical_clinic;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DoctorFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    //colors
    Color tealGreen = new Color(0, 150, 136);
    Color white     = new Color(255, 255, 255);
    Color mintColor = new Color(232, 245, 242);
    Color labelGray = new Color(100, 120, 115);
    Color tableHead = new Color(240, 244, 243);
    Color dangerRed = new Color(162, 45, 45);
    Color dangerBg  = new Color(252, 235, 235);
    
    private int answer;

    //buttons
    private JButton add_doctor;
    private JButton delete_doctor;
    private JButton edit_doctor;

    //text fields
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JTextField phoneField;
    private JComboBox<String> specialtyCombo;

    //table
    private JTable doctorTable;
    private DefaultTableModel tableModel;

    private String[] specialties = {
        "General Practitioner", "Cardiologist", "Dermatologist",
        "Neurologist", "Pediatrician", "Gynecologist",
        "Ophthalmologist", "Orthopedist", "Psychiatrist", "Radiologist"
    };

    public DoctorFrame() {

        this.setTitle("Doctors");
        this.setSize(1100, 510);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel(null);
        panel.setBackground(mintColor);
        this.setContentPane(panel);

        // header
        JLabel label = new JLabel("Doctors Management");
        label.setFont(new Font("SansSerif", Font.BOLD, 28));
        label.setForeground(tealGreen);
        label.setBounds(20, 10, 500, 40);
        panel.add(label);

        // left white card
        JPanel info = new JPanel(null);
        info.setBackground(white);
        info.setBounds(15, 60, 450, 390);
        panel.add(info);

        JLabel title = new JLabel("DOCTOR INFO");
        title.setFont(new Font("SansSerif", Font.BOLD, 11));
        title.setForeground(labelGray);
        title.setBounds(15, 12, 200, 16);
        info.add(title);

        // last name
        JLabel last_name = new JLabel("Last name");
        last_name.setFont(new Font("SansSerif", Font.PLAIN, 13));
        last_name.setForeground(labelGray);
        last_name.setBounds(15, 38, 200, 16);
        info.add(title);
        lastNameField = new JTextField();
        lastNameField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lastNameField.setBounds(15, 55, 410, 30);
        info.add(lastNameField);

        // first name
        JLabel first_Name = new JLabel("First name");
        first_Name.setFont(new Font("SansSerif", Font.PLAIN, 13));
        first_Name.setForeground(labelGray);
        first_Name.setBounds(15, 98, 200, 16);
        info.add(first_Name);
        firstNameField = new JTextField();
        firstNameField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        firstNameField.setBounds(15, 115, 410, 30);
        info.add(firstNameField);

        // speciality
        JLabel spec = new JLabel("Speciality");
        spec.setFont(new Font("SansSerif", Font.PLAIN, 13));
        spec.setForeground(labelGray);
        spec.setBounds(15, 158, 200, 16);
        info.add(spec);
        specialtyCombo = new JComboBox<>(specialties);
        specialtyCombo.setBounds(15, 175, 410, 30);
        specialtyCombo.setBackground(white);
        specialtyCombo.setFont(new Font("SansSerif", Font.PLAIN, 13));
        specialtyCombo.setFocusable(false);
        info.add(specialtyCombo);

        // phone
        JLabel phone = new JLabel("Phone \u2116");
        phone.setFont(new Font("SansSerif", Font.PLAIN, 13));

        phone.setBounds(15, 218, 200, 16);
        info.add(phone);
        phoneField = new JTextField();
        phoneField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        phoneField.setBounds(15, 235, 410, 30);
        info.add(phoneField);

        // buttons
        add_doctor = new JButton("Add");
        add_doctor.setBounds(15, 300, 190, 34);
        add_doctor.setBackground(tealGreen);
        add_doctor.setForeground(white);
        add_doctor.setFont(new Font("SansSerif", Font.BOLD, 14));
        add_doctor.setFocusable(false);
        add_doctor.addActionListener(this);
        info.add(add_doctor);

        edit_doctor = new JButton("Edit");
        edit_doctor.setBounds(220, 300, 190, 34);
        edit_doctor.setBackground(tealGreen);
        edit_doctor.setForeground(white);
        edit_doctor.setFont(new Font("SansSerif", Font.BOLD, 14));
        edit_doctor.setFocusable(false);
        edit_doctor.addActionListener(this);
        info.add(edit_doctor);

        delete_doctor = new JButton("Delete");
        delete_doctor.setBounds(15, 344, 190, 34);
        delete_doctor.setBackground(dangerBg);
        delete_doctor.setForeground(dangerRed);
        delete_doctor.setFont(new Font("SansSerif", Font.BOLD, 14));
        delete_doctor.setFocusable(false);
        delete_doctor.addActionListener(this);
        info.add(delete_doctor);

        // right table card
        JPanel tableCard = new JPanel(null);
        tableCard.setBackground(white);
        tableCard.setBounds(480, 60, 600, 390);
        panel.add(tableCard);

        JLabel tableTitle = new JLabel("DOCTOR LIST");
        tableTitle.setFont(new Font("SansSerif", Font.BOLD, 11));
        tableTitle.setForeground(labelGray);
        tableTitle.setBounds(15, 12, 200, 16);
        tableCard.add(tableTitle);

        String[] columns = {"Last name", "First name", "Speciality", "Phone"};
        tableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int col) { return false; }
        };

        doctorTable = new JTable(tableModel);
        doctorTable.setRowHeight(28);
        doctorTable.setFont(new Font("SansSerif", Font.PLAIN, 13));
        doctorTable.setBackground(white);
        doctorTable.setSelectionBackground(mintColor);
        doctorTable.setSelectionForeground(new Color(0, 80, 70));
        doctorTable.setShowVerticalLines(false);
        doctorTable.setFocusable(false);
        doctorTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
        doctorTable.getTableHeader().setBackground(tableHead);
        doctorTable.getTableHeader().setForeground(labelGray);
        doctorTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane scroll = new JScrollPane(doctorTable);
        scroll.setBounds(15, 35, 568, 340);
        tableCard.add(scroll);

        doctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = doctorTable.getSelectedRow();
                if (row >= 0) {
                    lastNameField.setText((String) tableModel.getValueAt(row, 0));
                    firstNameField.setText((String) tableModel.getValueAt(row, 1));
                    specialtyCombo.setSelectedItem(tableModel.getValueAt(row, 2));
                    phoneField.setText((String) tableModel.getValueAt(row, 3));
                }
            }
        });

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_doctor) {
            String last  = lastNameField.getText().trim();
            String first = firstNameField.getText().trim();
            String spec  = (String) specialtyCombo.getSelectedItem();
            String ph    = phoneField.getText().trim();
            if (last.isEmpty() || first.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields!");
                return;
            }
            tableModel.addRow(new Object[]{last, first, spec, ph});
            clearFields();
        }

        if (e.getSource() == delete_doctor) {
            int row = doctorTable.getSelectedRow();
            if (row < 0) { JOptionPane.showMessageDialog(null, "Select a doctor first!"); return; }
            answer = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Delete doctor", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) { tableModel.removeRow(row); clearFields(); }
        }

        if (e.getSource() == edit_doctor) {
            int row = doctorTable.getSelectedRow();
            if (row < 0) { JOptionPane.showMessageDialog(null, "Select a doctor first!"); return; }
            tableModel.setValueAt(lastNameField.getText().trim(), row, 0);
            tableModel.setValueAt(firstNameField.getText().trim(), row, 1);
            tableModel.setValueAt(specialtyCombo.getSelectedItem(), row, 2);
            tableModel.setValueAt(phoneField.getText().trim(), row, 3);
        }
    }

    private void clearFields() {
        lastNameField.setText("");
        firstNameField.setText("");
        phoneField.setText("");
        specialtyCombo.setSelectedIndex(0);
        doctorTable.clearSelection();
    }
}