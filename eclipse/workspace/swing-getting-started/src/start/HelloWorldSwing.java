package start;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class HelloWorldSwing {

	private static void createAndShowGUI() {

		JTextArea pyramidSizeInput = new JTextArea(10,10);
		
		JButton pyramidSizeBtn = new JButton("Enter Pyramid Size");
		
		JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		btnPanel.add(pyramidSizeBtn);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(pyramidSizeInput, BorderLayout.NORTH);
		mainPanel.add(btnPanel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Hello World");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pyramidOutput = new JPanel();
		pyramidOutput.add(label);
		
		
		JSplitPane splitPaneVertical = new JSplitPane(JSplitPane.VERTICAL_SPLIT, mainPanel, pyramidOutput);
		
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().add(label);
//		frame.setLayout(new BorderLayout());
//		frame.add(label, BorderLayout.CENTER);		
//		frame.pack(); // not necessary with .setSize() 
		frame.add(splitPaneVertical);
		frame.setVisible(true);
		frame.setSize(new Dimension(400,400));
		
		pyramidSizeBtn.addActionListener((e) -> {
			String pyramidSize = pyramidSizeInput.getText().trim();
			label.setText(pyramidSize);
		});
		
		pyramidSizeBtn.doClick();
		
		
		
		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
