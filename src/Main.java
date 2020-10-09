import processing.core.PApplet;

public class Main extends PApplet {

	int option;
	Figure circle;
	Square square;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		option=0;
		circle = new Circle(0, 0, mouseY, this);
		square = new Square(0, 0, mouseY, this);
	}
	
	public void draw() {
		
		background (255,255,255);
		rectMode(CENTER);
		
		fill(255,255,255);
		rect(100,100, 100, 50);
		rect(100,200, 100, 50);
		
		fill(0);
		textSize(20);
		text("Square", 70, 110);
		text("Circle", 70, 210);
		translate(400, 400);
		
		fill(255,255,255);
		
		switch (option) {
		case 0:
			
			break;
			
		case 1:
			
			//drawSquare(0, 0, mouseY*5, 1, (mouseY/50)+2);
			//square.drawFigure(0, 0, mouseY*5);
			//square.drawFigure(0, 0, mouseY*5);
			square.rotateSquare(0, 0, mouseY*5, 0, (mouseY/40)+2);
			
			break;
			
		case 2:
			
			circle.drawFigure(0, 0, mouseY*2);
			break;

		default:
			break;
		}
		
	}

	
	public void drawSquare(int x, int y, float size, int count,int rot) {
		
			
		    if(count%2==0) {
		    rotate(PI/rot);
		     rect(x, y, size, size);
			  rotate(PI/-rot);
			   }else {
		    rect(x, y, size, size);
		 }
		     count=count+1; 
		     
		    if(size > 2) {
			 
		    size *= 0.75f;
		   
		    drawSquare(x, y, size,count,rot);
			  
		    
		   		  }
		}
	
	public void mouseClicked() {
		
		if (mouseX > 50 && mouseX < 50+100 
				&& mouseY > 75 && mouseY < 75+50) {
			option=1;
		}
		
		if (mouseX > 50 && mouseX < 50+100 
				&& mouseY > 175 && mouseY < 175+50) {
			option=2;
		}
		
	}

}
