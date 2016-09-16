package com.solidprinciples.lsp.after;

public class LSPDemo {
	
	private static Rectangle getNewRectangle() {
        return new Rectangle();
        // return new Square(); // GOOD: This results in a compile error
    }

	public static void main(String[] args) {

		Rectangle r = getNewRectangle();

        r.setWidth(5);
        r.setHeight(10);

        System.out.println("Rectangle with 5 and 10 = " + r.computeArea());
	}

}
