package pe.com.test.graphics;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JFrame;

import pe.com.test.graphics.vehicules.Vehicule;

public class Track extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Vehicule> vehicules;
	
	public Track() throws HeadlessException {
		super("ITLA Racer V0.1");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getRootPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		vehicules = new ArrayList<>();
	}
	
	public void add(Vehicule vehicule) {
		vehicules.add(vehicule);
	}
	
	public void start() {
		setLayout(new GridLayout(vehicules.size(), 1));
		TrackLane lane = null;
		for(Vehicule vehicule : vehicules) {
			lane = new TrackLane();
			lane.add(vehicule.getLabel());
			add(lane);
		}
		setVisible(true);
		for(Vehicule vehicule : vehicules) {
			vehicule.getLabel();
			vehicule.start();
		}
	}
}
