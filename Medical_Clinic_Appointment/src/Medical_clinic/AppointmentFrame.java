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

public class AppointmentFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    //colors
    Color tealGreen = new Color(0, 150, 136);
    Color white     = new Color(255, 255, 255);
    Color mintColor = new Color(232, 245, 242);
    Color tableHead = new Color(240, 244, 243);
    Color dangerRed = new Color(162, 45, 45);
    Color dangerBg  = new Color(252, 235, 235);
    Color labelGray = new Color(100, 120, 115);
    
    private int answer;

    private JButton add_appointment;
    private JButton delete_appointment;
    private JButton edit_appointment;

    private JTextField patientNameField;
    private JTextField doctorNameField;
    private JTextField dateField;
    private JTextField timeField;
    private JComboBox<String> statusCombo;

    private JTable appointmentTable;
    private DefaultTableModel tableModel;

    private String[] statuses = {"Scheduled", "Confirmed", "Completed", "Cancelled"};

    public AppointmentFrame() {

        this.setTitle("Appointments");
        this.setSize(1100, 560);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel(null);
        panel.setBackground(mintColor);
        this.setContentPane(panel);

        JLabel label = new JLabel("Appointments Management");
        label.setFont(new Font("SansSerif", Font.BOLD, 28));
        label.setForeground(tealGreen);
        label.setBounds(20, 10, 600, 40);
        panel.add(label);

        // left white card
        JPanel card = new JPanel(null);
        card.setBackground(white);
        card.setBounds(15, 60, 450, 450);
        panel.add(card);

        JLabel Title = new JLabel("APPOINTMENT INFO");
        Title.setFont(new Font("SansSerif", Font.BOLD, 11));   
        Title.setBounds(15, 12, 250, 16);
        card.add(Title);

        // patient name
        JLabel patient_name = new JLabel("Patient full name");
        patient_name.setFont(new Font("SansSerif", Font.PLAIN, 13));
        patient_name.setBounds(15, 38, 250, 16);
        card.add(patient_name);
        patientNameField = new JTextField();
        patientNameField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        patientNameField.setBounds(15, 55, 410, 30);
        card.add(patientNameField);

        // doctor name
        JLabel doctor_name = new JLabel("Doctor full name");
        doctor_name.setFont(new Font("SansSerif", Font.PLAIN, 13));
        doctor_name.setBounds(15, 98, 250, 16);
        card.add(doctor_name);
        doctorNameField = new JTextField();
        doctorNameField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        doctorNameField.setBounds(15, 115, 410, 30);
        card.add(doctorNameField);

        // date
        JLabel date = new JLabel("Date (DD/MM/YYYY)");
        date.setFont(new Font("SansSerif", Font.PLAIN, 13));
        date.setBounds(15, 158, 250, 16);
        card.add(date);
        dateField = new JTextField();
        dateField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        dateField.setBounds(15, 175, 410, 30);
        card.add(dateField);

        // time
        JLabel time = new JLabel("Time (HH:MM)");
        time.setFont(new Font("SansSerif", Font.PLAIN, 13));
        time.setBounds(15, 218, 250, 16);
        card.add(time);
        timeField = new JTextField();
        timeField.setFont(new Font("SansSerif", Font.PLAIN, 13));
        timeField.setBounds(15, 235, 410, 30);
        card.add(timeField);

        // status
        JLabel status = new JLabel("Status");
        status.setFont(new Font("SansSerif", Font.PLAIN, 13));
        status.setBounds(15, 278, 200, 16);
        card.add(status);
        statusCombo = new JComboBox<>(statuses);
        statusCombo.setBounds(15, 295, 410, 30);
        statusCombo.setBackground(white);
        statusCombo.setFont(new Font("SansSerif", Font.PLAIN, 13));
        statusCombo.setFocusable(false);
        card.add(statusCombo);

        // buttons
        add_appointment = new JButton("Add");
        add_appointment.setBounds(15, 360, 190, 34);
        add_appointment.setBackground(tealGreen);
        add_appointment.setForeground(white);
        add_appointment.setFont(new Font("SansSerif", Font.BOLD, 14));
        add_appointment.setFocusable(false);
        add_appointment.addActionListener(this);
        card.add(add_appointment);

        edit_appointment = new JButton("Edit");
        edit_appointment.setBounds(220, 360, 190, 34);
        edit_appointment.setBackground(white);
        edit_appointment.setForeground(new Color(50, 50, 50));
        edit_appointment.setFont(new Font("SansSerif", Font.BOLD, 14));
        edit_appointment.setFocusable(false);
        edit_appointment.addActionListener(this);
        card.add(edit_appointment);

        delete_appointment = new JButton("Delete");
        delete_appointment.setBounds(15, 404, 190, 34);
        delete_appointment.setBackground(dangerBg);
        delete_appointment.setForeground(dangerRed);
        delete_appointment.setFont(new Font("SansSerif", Font.BOLD, 14));
        delete_appointment.setFocusable(false);
        delete_appointment.addActionListener(this);
        card.add(delete_appointment);

        // right table card
        JPanel tableCard = new JPanel(null);
        tableCard.setBackground(white);
        tableCard.setBounds(480, 60, 600, 450);
        panel.add(tableCard);

        JLabel tableTitle = new JLabel("APPOINTMENT LIST");
        tableTitle.setFont(new Font("SansSerif", Font.BOLD, 11));
        tableTitle.setForeground(labelGray);
        tableTitle.setBounds(15, 12, 250, 16);
        tableCard.add(tableTitle);

        String[] columns = {"Patient", "Doctor", "Date", "Time", "Status"};
        tableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int col) { return false; }
        };

        appointmentTable = new JTable(tableModel);
        appointmentTable.setRowHeight(28);
        appointmentTable.setFont(new Font("SansSerif", Font.PLAIN, 13));
        appointmentTable.setBackground(white);
        appointmentTable.setSelectionBackground(mintColor);
        appointmentTable.setSelectionForeground(new Color(0, 80, 70));
        appointmentTable.setShowVerticalLines(false);
        appointmentTable.setFocusable(false);
        appointmentTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
        appointmentTable.getTableHeader().setBackground(tableHead);
        appointmentTable.getTableHeader().setForeground(labelGray);
        appointmentTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane scroll = new JScrollPane(appointmentTable);
        scroll.setBounds(15, 35, 568, 400);
        tableCard.add(scroll);

        appointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = appointmentTable.getSelectedRow();
                if (row >= 0) {
                    patientNameField.setText((String) tableModel.getValueAt(row, 0));
                    doctorNameField.setText((String) tableModel.getValueAt(row, 1));
                    dateField.setText((String) tableModel.getValueAt(row, 2));
                    timeField.setText((String) tableModel.getValueAt(row, 3));
                    statusCombo.setSelectedItem(tableModel.getValueAt(row, 4));
                }
            }
        });

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_appointment) {
            String patient = patientNameField.getText().trim();
            String doctor  = doctorNameField.getText().trim();
            String d       = dateField.getText().trim();
            String t       = timeField.getText().trim();
            String status  = (String) statusCombo.getSelectedItem();
            if (patient.isEmpty() || doctor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields!");
                return;
            }
            tableModel.addRow(new Object[]{patient, doctor, d, t, status});
            clearFields();
        }

        if (e.getSource() == delete_appointment) {
            int row = appointmentTable.getSelectedRow();
            if (row < 0) { JOptionPane.showMessageDialog(null, "Select an appointment first!"); return; }
            answer = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Delete appointment", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) { tableModel.removeRow(row); clearFields(); }
        }

        if (e.getSource() == edit_appointment) {
            int row = appointmentTable.getSelectedRow();
            if (row < 0) { JOptionPane.showMessageDialog(null, "Select an appointment first!"); return; }
            tableModel.setValueAt(patientNameField.getText().trim(), row, 0);
            tableModel.setValueAt(doctorNameField.getText().trim(),  row, 1);
            tableModel.setValueAt(dateField.getText().trim(),        row, 2);
            tableModel.setValueAt(timeField.getText().trim(),        row, 3);
            tableModel.setValueAt(statusCombo.getSelectedItem(),     row, 4);
        }
    }

    private void clearFields() {
        patientNameField.setText("");
        doctorNameField.setText("");
        dateField.setText("");
        timeField.setText("");
        statusCombo.setSelectedIndex(0);
        appointmentTable.clearSelection();
    }
}