package fr.tp.inf112.projects.robotsim.model.shapes;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import fr.tp.inf112.projects.canvas.model.RectangleShape;

public class RectangularShape extends PositionedShape implements RectangleShape {
	
	@JsonInclude
	private static final long serialVersionUID = -6113167952556242089L;

	@JsonInclude
	private final int width;

	@JsonInclude
	private final int height;
	
	public RectangularShape() {
		this(0, 0, 0, 0);
	}

	public RectangularShape(final int xCoordinate,
							final int yCoordinate,
							final int width,
							final int heigth) {
		super(xCoordinate, yCoordinate);
	
		this.width = width;
		this.height = heigth;
	}

	@JsonGetter("width")
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return super.toString() + " [width=" + width + ", heigth=" + height + "]";
	}
}
