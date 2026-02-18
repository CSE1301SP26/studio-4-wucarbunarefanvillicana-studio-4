package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(173,216,230);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.28);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledEllipse(0.5,0.35,0.1,0.1);

		StdDraw.setPenColor(255,255,255);
		StdDraw.filledEllipse(0.5,0.51,0.07,0.07);

		StdDraw.setPenColor(255,255,255);
		StdDraw.filledEllipse(0.5,0.625,0.05,0.05);

		StdDraw.setPenColor(255,165,0);
		double[] x = {0.51,0.51,0.55};
		double[] y = {0.595, 0.615, 0.605};
		StdDraw.filledPolygon(x,y);

		StdDraw.setPenColor(0,0,0);
		StdDraw.filledEllipse(0.485,0.645,0.005,0.005);

		StdDraw.setPenColor(0,0,0);
		StdDraw.filledEllipse(0.525,0.645,0.005,0.005);

		StdDraw.filledRectangle(0.5, 0.68, 0.07, 0.025);
		StdDraw.filledRectangle(0.5, 0.7, 0.03, 0.031);

		StdDraw.filledEllipse(0.5,0.5,0.005,0.005);
		StdDraw.filledEllipse(0.5,0.4,0.005,0.005);
		StdDraw.filledEllipse(0.5,0.45,0.005,0.005);

		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.5, 0.57, 0.05, 0.01);
		StdDraw.filledRectangle(0.54, 0.53, 0.01, 0.05);
	}
}