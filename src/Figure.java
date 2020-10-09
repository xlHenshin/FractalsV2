import processing.core.PApplet;

public abstract class Figure extends PApplet{
	
	PApplet app;
	protected int x;
	protected int y;
	protected float size;
	
	public Figure(int x, int y, float size, PApplet app) {
		
		this.x = x;
		this.y = y;
		this.size = size;
		this.app = app;
		
	}
	
	protected abstract void drawFigure(int x, int y, float size);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	
	
}
