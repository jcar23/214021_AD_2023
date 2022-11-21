package pt.uma.tpsi;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame {
    private JPanel jPanelMain;
    private JButton okayButton;
    private JButton cancelButton;
    private JButton submitButton;
    private JLabel Label1;
    private JLabel Label2;
    private JList list1;

    public Swing(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(jPanelMain);

        DefaultListModel<Point> points = new DefaultListModel<Point>();
        //this.list1.add("test", new JLabel("JLabel Text"));
        points.add(0, new Point(2,4));
        points.add(1, new Point(4,6));
        points.add(2, new Point(2,9));
        points.add(3, new Point(7,4));
        this.list1.setModel(points);

        this.pack();



        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okayButtonPressed(e);
                Label2.setText(e.getSource().getClass().getSimpleName());
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButtonPressed(e);
                Label2.setText(e.getSource().getClass().getSimpleName());
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelButtonPressed(e);
                Label2.setText(e.getSource().getClass().getSimpleName());
            }
        });
        list1.addListSelectionListener(new ListSelectionListener (){
            @Override
            public void valueChanged(ListSelectionEvent e){
                Label2.setText(e.getFirstIndex() + "");
            }
        });

        okayButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
    }

    public void okayButtonPressed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Label1.setText(button.getText() + "Button Pressed");
    }

    public void submitButtonPressed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Label1.setText(button.getText() + "Button Pressed");
    }

    private void cancelButtonPressed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Label1.setText(button.getText() + "Button Pressed");

    }
    public static void main(String[] args){
        JFrame frame = new Swing("Java Swing Examples");
        frame.setVisible(true);
    }


    //@SuppressWarnings("ResultOfMethodCallIgnored")
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("okay")) {
                Label1.setText("okay Button Clicked");
                Label2.getClass();
            } else if (command.equals("submit")) {
                Label1.setText("Submit Button Clicked");
                Label2.getClass();
            } else if (command.equals("cancel")) {
                Label1.setText("Cancel Button Pressed");
                Label2.getClass();
            } else {
                Label1.setText("");
            }
        }
    }
}
