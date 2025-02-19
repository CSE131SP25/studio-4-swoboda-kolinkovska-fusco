package studio4;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	
	public static void mother() {
        // Set canvas size and scale
        StdDraw.setCanvasSize(660, 480);  // 22:16 ratio scaled to 660x480
        StdDraw.setXscale(0, 22);
        StdDraw.setYscale(0, 16);

        // Draw the red background
        StdDraw.setPenColor(new Color(186, 12, 47));  // Official Norway red
        StdDraw.filledRectangle(11, 8, 11, 8);

        // Draw the white cross (vertical and horizontal bars)
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledRectangle(6, 8, 1, 8);  // Vertical bar
        StdDraw.filledRectangle(11, 6, 11, 1); // Horizontal bar

        // Draw the blue cross inside the white cross
        StdDraw.setPenColor(new Color(0, 32, 91));  // Official Norway blue
        StdDraw.filledRectangle(6, 8, 0.5, 8);  // Vertical bar (inside white)
        StdDraw.filledRectangle(11, 6, 11, 0.5); // Horizontal bar (inside white)
        
        System.out.println("Norwegian flag drawn successfully.");
	   
		StdDraw.clear();
        StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}
	

   

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		
		// TODO
	}

	public static void indonesia() {
		
		// TODO
	}

	public static void netherlands() {
		
		// TODO
	}

	public static void poland() {
		
		// TODO
	}

	public static void thailand() {
		
		// TODO
	}

	public static void finland() {
		
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
