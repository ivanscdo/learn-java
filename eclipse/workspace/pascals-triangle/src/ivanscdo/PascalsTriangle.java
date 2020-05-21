package ivanscdo;

import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class PascalsTriangle {
	
	// takes number of rows in triangle and builds 2D ArrayList 
	private static  ArrayList<ArrayList<Integer>> buildTriangle(int pyramidSize) {
		// iteration 7

        // number of rows in triangle 
        int n = pyramidSize; 

        // sum previous row's elements to build current row
        int sum = 0; 

        // 2D ArrayList, holds Pascal's Triangle
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>(); 

        // saves previous row to build current row
        ArrayList<Integer> prevRow = new ArrayList<Integer>();

        // Instantiate all columns of 2D ArrayList
        for (int i = 0; i < n; i++) {
            pascal.add(new ArrayList<Integer>());
        }

        // builds Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // builds first 2 rows
            if (i < 2) {
                for (int j = 0; j <= i; j++) {
                    pascal.get(i).add(j, 1);
                }
            // builds rows 3 and beyond
            } else {
                // adds the first int 1 to current row
                pascal.get(i).add(0, 1); 

				// adds all middle ints to current row. number of 
				// iterations based on numbers in current row minus 2,
				// since first and last 1's are added outside loop.
				// ex: third row [1, 2, 1] will only iterate once
				// to add int 2, while fourth row [1, 3, 3, 1] will
				// iterate twice to add int 3 and 3.
                for (int k = 1; k < prevRow.size(); k++) { 
                    // clear sum at start of loop
                    sum = 0;
                    // sum previous row's elements
                    sum = prevRow.get(k) + prevRow.get(k-1);
                    // add previous row's sum to current row in appropriate position
                    pascal.get(i).add(sum); 
                }

                // adds the last int 1 to current row
                pascal.get(i).add(i, 1); 
            }
            // clears contents of prevRow, otherwise ALL previous rows would be saved
            prevRow.clear();
            // saves current row on pascal to prevRow to be used on next iteration i
            prevRow.addAll(pascal.get(i));
        }

		return pascal;
	}
	
	// takes 2D ArrayList and JTextArea, then prints triangle to text area
	private static JTextArea printTriangle(ArrayList<ArrayList<Integer>> pascal, JTextArea triangleOutputArea) {

		// start off with blank slate; null out previous triangle
		triangleOutputArea.setText("");
		
		// iterate through 2D ArrayList (pascal) and print triangle to text area (triangleOutputArea)		
        for (int i = 0; i < pascal.size(); i++) {
            for (int j = 0; j <= i; j++) {
//                System.out.print(pascal.get(i).get(j) + " ");
                triangleOutputArea.setText(triangleOutputArea.getText() + Integer.toString(pascal.get(i).get(j)) + " ");
            }
//            System.out.println();
            triangleOutputArea.setText(triangleOutputArea.getText() + "\n");
        }
        return triangleOutputArea;
	}

	// creates window
	private static void createAndShowGUI() {

		// input for number of rows in triangle
		JTextField triangleSizeTxt = new JTextField(10);
		
		// button to submit number of rows
		JButton triangleSizeBtn = new JButton("Enter Triangle Size");
		JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnPanel.add(triangleSizeBtn);
		
		// top portion of window - input and button
		JPanel triangleInputPanel = new JPanel();
		triangleInputPanel.setLayout(new BorderLayout());
		triangleInputPanel.add(triangleSizeTxt, BorderLayout.NORTH);
		triangleInputPanel.add(btnPanel, BorderLayout.CENTER);
		
		// bottom portion of window - triangle output
		JTextArea triangleOutputArea = new JTextArea();
		triangleOutputArea.setEditable(false);
		
		// splits top and bottom portion of window, sets divider
		JSplitPane splitPaneVertical = new JSplitPane(JSplitPane.VERTICAL_SPLIT, triangleInputPanel, triangleOutputArea);
		splitPaneVertical.setDividerLocation(70);
		
		// creates actual window, adds above components, and sets size
		JFrame frame = new JFrame("Pascal's Triangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPaneVertical);
		frame.setVisible(true);
		frame.setSize(new Dimension(400,400));
		
		// event listener for submit button; builds & prints triangle
		triangleSizeBtn.addActionListener((e) -> {
			String triangleSizeString = triangleSizeTxt.getText().trim();
			int triangleSizeInt = Integer.parseInt(triangleSizeString);
			ArrayList<ArrayList<Integer>> pascal = buildTriangle(triangleSizeInt);
			
			printTriangle(pascal, triangleOutputArea);
		});	
	}	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
