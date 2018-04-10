import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This class creates the Panel for the Vehicles class to be display on the
 * frame
 * @author Sylvia Chan
 */
public class VehiclesPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    protected JButton ferraisLabel, trucksLabel, sailBoatsLabel, yachtsLabel;
    protected Vehicle veh;
    protected JPanel vehiclepanel;

    /**
     * This creates the 4 JButtons for the user to choose and a listener is
     * listening to the actions Then the keyListener is listening further to the
     * user's press of button.
     */
    public VehiclesPanel() {
        addKeyListener(new VehiclesListener());

        setPreferredSize(new Dimension(500, 500));
        setFocusable(true);

        ferraisLabel = new JButton("Ferrais");
        trucksLabel = new JButton("Truck");
        sailBoatsLabel = new JButton("Sail Boat");
        yachtsLabel = new JButton("Yacht");

        ButtonListener listener = new ButtonListener();

        vehiclepanel = this;
        veh = null;

        this.add(ferraisLabel);
        this.add(trucksLabel);
        this.add(sailBoatsLabel);
        this.add(yachtsLabel);

        ferraisLabel.addActionListener(listener);
        trucksLabel.addActionListener(listener);
        sailBoatsLabel.addActionListener(listener);
        yachtsLabel.addActionListener(listener);

        setBackground(Color.yellow);
    }

    /**
     * This creates the ButtonListener to listen to the user's choice of
     * vehicles. Then it creates the correct type of vehicles according to the
     * user's choice.
     */
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == ferraisLabel) {
                veh = new Ferrais();
            } else if (event.getSource() == trucksLabel) {
                veh = new Trucks();
            } else if (event.getSource() == sailBoatsLabel) {
                veh = new SailBoats();
            } else if (event.getSource() == yachtsLabel) {
                veh = new Yachts();
            }
            repaint();
            vehiclepanel.requestFocusInWindow();
        }
    }

    /**
     * This draw the vehicles on the panel if vehicle type is not null.
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (veh != null) {

            veh.draw(page);
        }
    }

    /**
     * This creates the VehiclesListener to listen to the user's choice of
     * vehicles' movements. Then the vehicles move.
     */
    private class VehiclesListener implements KeyListener {
        // --------------------------------------------------------------
        // Responds to the user pressing arrow keys by adjusting the
        // image and image location accordingly.
        // --------------------------------------------------------------
        public void keyPressed(KeyEvent event) {
            veh.move(event.getKeyChar());
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub

        }
    }
}