package com.solidprinciples.lsp;

public class LSPMain {
	
	  private static Rectangle getNewRectangle() {
	        // BAD; Square changes the behaviour of its parent class, Rectangle
	        return new Square();
	    }

	public static void main(String args[]) {
		
		Rectangle square = getNewRectangle();
		square.setHeight(5);
		square.setWidth(15);
		System.out.println("Area of SQ.."+square.computeArea());
	}

}
