package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
//--
        Scanner inputScanner = new Scanner(System.in);
        
        // Get file path from user
        System.out.println("Enter the path of the shape file:");
        String filePath = inputScanner.nextLine();
        
        // Open the file for reading
        Scanner fileScanner = new Scanner(new File(filePath));

        // Set up the drawing canvas
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Read and draw shapes
        while (fileScanner.hasNext()) {
            String shapeType = fileScanner.next();
            int red = fileScanner.nextInt();
            int green = fileScanner.nextInt();
            int blue = fileScanner.nextInt();
            boolean isFilled = fileScanner.nextBoolean();
            
            StdDraw.setPenColor(new Color(red, green, blue));

            if (shapeType.equals("rectangle")) {
                double x = fileScanner.nextDouble();
                double y = fileScanner.nextDouble();
                double halfWidth = fileScanner.nextDouble();
                double halfHeight = fileScanner.nextDouble();
                
                if (isFilled) {
                    StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
                } else {
                    StdDraw.rectangle(x, y, halfWidth, halfHeight);
                }
            } else if (shapeType.equals("ellipse")) {
                double x = fileScanner.nextDouble();
                double y = fileScanner.nextDouble();
                double semiMajor = fileScanner.nextDouble();
                double semiMinor = fileScanner.nextDouble();
                
                if (isFilled) {
                    StdDraw.filledEllipse(x, y, semiMajor, semiMinor);
                } else {
                    StdDraw.ellipse(x, y, semiMajor, semiMinor);
                }
            } else if (shapeType.equals("triangle")) {
                double x1 = fileScanner.nextDouble();
                double y1 = fileScanner.nextDouble();
                double x2 = fileScanner.nextDouble();
                double y2 = fileScanner.nextDouble();
                double x3 = fileScanner.nextDouble();
                double y3 = fileScanner.nextDouble();
                
                double[] xCoords = {x1, x2, x3};
                double[] yCoords = {y1, y2, y3};
                
                if (isFilled) {
                    StdDraw.filledPolygon(xCoords, yCoords);
                } else {
                    StdDraw.polygon(xCoords, yCoords);