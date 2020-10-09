import processing.core.PApplet;

public class Circle extends Figure {

	public Circle(int x, int y, float size, PApplet app) {
		super(x, y, size, app);
	}
	
	protected void drawFigure(int x, int y, float size) {
		app.ellipse(x, y, size, size);
		  if(size >= 1) {
		    size *= 0.75f;
		    drawFigure(x, y, size);
		  }
		
	}

}
