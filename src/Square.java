import processing.core.PApplet;

public class Square extends Figure implements Rotable {

	public Square(int x, int y, float size, PApplet app) {
		super(x, y, size, app);
		
	}

	
	protected void drawFigure(int x, int y, float size) {
		
		app.rect(x, y, size, size);
		
		if(size >= 1) {
			 
		    size *= 0.75f;
		   
		    drawFigure(x, y, size);
			  
		    
		   		  }
	}


	public void rotateSquare(int x, int y, float size, int count, int rot) {
		
		if(count%2==0) {
		    rotate(PI/rot);
		     app.rect(x, y, size, size);
			  rotate(PI/rot);
			   }else {
		    app.rect(x, y, size, size);
		 }
		     count=count+1; 
		     
		    if(size > 2) {
			 
		    size *= 0.75f;
		   
		    rotateSquare(x, y, size, count, rot);
			  
		    
		   		  }
	}
		
}
