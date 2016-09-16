package com.solidprinciples.lsp.after;

public class Shape {

    protected int width;
    protected int height;
    
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int computeArea() {
        return width * height;
    }

}