package Medical_clinic;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PatientFrame extends JFrame implements ActionListener {

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
    private JButton add_patient;
    private JButton delete_patient;
    private JButton edit_patient;

    //text fields
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JTextField dateBirthField;
    private JTextField phoneField;
    private JTextField addressField;

    //table
    private JTable patientTable;
    private DefaultTableModel tableModel;
    
    public PatientFrame() {

        this.setTitle("Patients");
        this.setSize(1100, 560);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel(null);
        panel.setBackground(mintColor);
        this.setContentPane(panel);

        JLabel label = new JLabel("Patients Management");
        label.setFont(new Font("SansSerif", Font.BOLD, 28));
        label.setForeground(tealGreen);
        label.setBounds(20, 10, 500, 40);
        panel.add(label);

        // left white card
        JPanel info = new JPanel(null);
        info.setBackground(white);
        info.setBounds(15, 60, 450, 450);
        panel.add(info);

        JLabel cardTitle = new JLabel("PATIENT INFO");
        cardTitle.setFont(new Font("SansSerif", Font.BOLD, 11));
        cardTitle.setForeground(labelGray);
        cardTitle.setBounds(15, 12, 200, 16);
        info.add(cardTitle);

        // last name
        JLabel last_name = new JLabel("Last name");
        last_name.setFont(new Font("SansSerif", Font.PLAIN, 13));
        last_name.setForeground(labelGray);
        last_name.setBounds(15, 38, 200, 16);
        info.add(last_name);
        lastNameField = new JTextField();
        lastNameField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lastNameField.setBounds(15, 55, 410, 30);
        info.add(lastNameField);

        // first name
        JLabel first_name = new JLabel("First name");
        first_name.setFont(new Font("SansSerif", Font.PLAIN, 13));
        first_name.setForeground(labelGray);
        first_name.setBounds(15, 98, 200, 16);
        info.add(first_name);
        firstNameField = new JTextField();
        firstNameField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        firstNameField.setBounds(15, 115, 410, 30);
        info.add(firstNameField);

        // date of birth
        JLabel date = new JLabel("Date of birth (DD/MM/YYYY)");
        date.setFont(new Font("SansSerif", Font.PLAIN, 13));
        date.setForeground(labelGray);
        date.setBounds(15, 158, 280, 16);
        info.add(date);
        dateBirthField = new JTextField();
        dateBirthField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        dateBirthField.setBounds(15, 175, 410, 30);
        info.add(dateBirthField);

        // phone
        JLabel phone = new JLabel("Phone \u2116");
        phone.setFont(new Font("SansSerif", Font.PLAIN, 13));
        phone.setForeground(labelGray);
        phone.setBounds(15, 218, 200, 16);
        info.add(phone);
        phoneField = new JTextField();
        phoneField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        phoneField.setBounds(15, 235, 410, 30);
        info.add(phoneField);

        // address
        JLabel lbl5 = new JLabel("Address");
        lbl5.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lbl5.setForeground(labelGray);
        lbl5.setBounds(15, 278, 200, 16);
        info.add(lbl5);
        addressField = new JTextField();
        addressField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        addressField.setBounds(15, 295, 410, 30);
        info.add(addressField);

        // buttons
        add_patient = new JButton("Add");
        add_patient.setBounds(15, 360, 190, 34);
        add_patient.setBackground(tealGreen);
        add_patient.setForeground(white);
        add_patient.setFont(new Font("SansSerif", Font.BOLD, 14));
        add_patient.setFocusable(false);
        add_patient.addActionListener(this);
        info.add(add_patient);

        edit_patient = new JButton("Edit");
        edit_patient.setBounds(220, 360, 190, 34);
        edit_patient.setBackground(tealGreen);
        edit_patient.setForeground(white);
        edit_patient.setFont(new Font("SansSerif", Font.BOLD, 14));
        edit_patient.setFocusable(false);
        edit_patient.addActionListener(this);
        info.add(edit_patient);

        delete_patient = new JButton("Delete");
        delete_patient.setBounds(15, 404, 190, 34);
        delete_patient.setBackground(dangerBg);
        delete_patient.setForeground(dangerRed);
        delete_patient.setFont(new Font("SansSerif", Font.BOLD, 14));
        delete_patient.setFocusable(false);
        delete_patient.addActionListener(this);
        info.add(delete_patient);

        // right table card
        JPanel tableCard = new JPanel(null);
        tableCard.setBackground(white);
        tableCard.setBounds(480, 60, 600, 450);
        panel.add(tableCard);

        JLabel tableTitle = new JLabel("PATIENT LIST");
        tableTitle.setFont(new Font("SansSerif", Font.BOLD, 11));
        tableTitle.setForeground(labelGray);
        tableTitle.setBounds(15, 12, 200, 16);
        tableCard.add(tableTitle);

        String[] columns = {"Last name", "First name", "Date of birth", "Phone", "Address"};
        tableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int col) { return false; }
        };

        patientTable = new JTable(tableModel);
        patientTable.setRowHeight(28);
        patientTable.setFont(new Font("SansSerif", Font.PLAIN, 13));
        patientTable.setBackground(white);
        patientTable.setSelectionBackground(mintColor);
        patientTable.setSelectionForeground(new Color(0, 80, 70));
        patientTable.setShowVerticalLines(false);
        patientTable.setFocusable(false);
        patientTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
        patientTable.getTableHeader().setBackground(tableHead);
        patientTable.getTableHeader().setForeground(labelGray);
        patientTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane scroll = new JScrollPane(patientTable);
        scroll.setBounds(15, 35, 568, 400);
        tableCard.add(scroll);

        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = patientTable.getSelectedRow();
                if (row >= 0) {
                    lastNameField.setText((String) tableModel.getValueAt(row, 0));
                    firstNameField.setText((String) tableModel.getValueAt(row, 1));
                    dateBirthField.setText((String) tableModel.getValueAt(row, 2));
                    phoneField.setText((String) tableModel.getValueAt(row, 3));
                    addressField.setText((String) tableModel.getValueAt(row, 4));
                }
            }
        });

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_patient) {
            String last  = lastNameField.getText().trim();
            String first = firstNameField.getText().trim();
            String dob   = dateBirthField.getText().trim();
            String ph    = phoneField.getText().trim();
            String adr   = addressField.getText().trim();
            if (last.isEmpty() || first.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields!");
                return;
            }
            tableModel.addRow(new Object[]{last, first, dob, ph, adr});
            clearFields();
        }

        if (e.getSource() == delete_patient) {
            int row = patientTable.getSelectedRow();
            if (row < 0) { JOptionPane.showMessageDialog(null, "Select a patient first!"); return; }
            answer = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Delete patient", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) { tableModel.removeRow(row); clearFields(); }
        }

        if (e.getSource() == edit_patient) {
            int row = patientTable.getSelectedRow();
            if (row < 0) { JOptionPane.showMessageDialog(null, "Select a patient first!"); return; }
            tableModel.setValueAt(lastNameField.getText().trim(),  row, 0);
            tableModel.setValueAt(firstNameField.getText().trim(), row, 1);
            tableModel.setValueAt(dateBirthField.getText().trim(), row, 2);
            tableModel.setValueAt(phoneField.getText().trim(),     row, 3);
            tableModel.setValueAt(addressField.getText().trim(),   row, 4);
        }
    }

    private void clearFields() {
        lastNameField.setText("");
        firstNameField.setText("");
        dateBirthField.setText("");
        phoneField.setText("");
        addressField.setText("");
        patientTable.clearSelection();
    }
}