package com.app.vp.chapter_2_composition;

/**
 * Class Line showing composition in relation to class Point
 * Idea is that we can define our line as two points (begin point, end point)
 * So, composition expresses the relation HAS-A
 * Line has-a points
 * */
public class Line {

    //variables came from Point lass
    private Point begin;
    private Point end;

    //constructor with Points
    public Line(Point begin, Point end) {
        this.begin = begin; //invoke created objects
        this.end = end;
    }

    //constructor with coordinates
    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1); //creating Point
        this.end = new Point(x2, y2);
    }

    //getters & setters
    //Point
    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    //Begin
    //coordinates values (x, y)
    public int getBeginX(){
        return this.begin.getX(); //getX() from class Point as begin of line
    }
    public int getBeginY(){
        return this.begin.getY();//getY() from class Point as begin of line
    }
    public void setBeginX(int x){
        this.begin.setX(x);//setX(x) from class Point as begin of line
    }
    public void setBeginY(int y){
        this.begin.setY(y);//setY(y) from class Point as begin of line
    }
    /**
     * getBeginXY(int x, int y)
     * @param x value from int[0]
     * @param y value from int[1]
     * @return int[] of points
     * */
    public int[] getBeginXY(int x, int y){
        return this.begin.getXY();//getter getXY(x, y) from Point class
    }
    /**
     * setBeginXY(int x, int y)
     * @param x value to set for point on x coordinate as int[0]
     * @param y value to set for point on y coordinate as int[1]
     * */
    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y); //setter setXY(x, y) from Point class
    }

    //End
    //coordinates values (x, y)
    public int getEndX(){
        return this.end.getX();//getX() from class Point as end of line
    }
    public int getEndY(){
        return this.end.getY();//getY() from class Point as end of line
    }
    public void setEndX(int x){
        this.end.setX(x);//setX(x) from class Point as end of line
    }
    public void setEndY(int y){
        this.end.setY(y);//setY(y) from class Point as end of line
    }
    /**
     * getEndXY(int x, int y)
     * @param x value from int[0]
     * @param y value from int[1]
     * @return int[] of points
     */
    public int[] getEndXY(int x, int y){
        return this.end.getXY();
    }
    /**
     * setEndXY(int x, int y)
     * @param x value to set for point on x coordinate as int[0]
     * @param y value to set for point on y coordinate as int[1]
     * */
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);//setter setXY(x, y) from Point class
    }

    /**
     * Method toString() show String value of Line class in accordance with begin and end points
     * @return String
     * */
    @Override
    public String toString() {
        return "Line: (begin point - " + begin +", end point - " + end +")";
    }

    /**
     * Method getLength() calculate double value of length for constructed line
     * based on begin and end points by setting coordinates for them consequently
     * @return line length as double value
     * */
    public double getLength(){
        return begin.distance(end); //calculation distance between points
    }

    /**
     * Method getGradient() defining the angle of inclination of the segment relative to the X axis
     * The formula: for the slope of a line is (y2 - y1) / (x2 - x1),
     * where (x1, y1) represents the beginning point and (x2, y2) represents the end point.
     * @return the slope (gradient) as a double value
     * */
    public double getGradient(){
        //check for division by zero (avoid if the line is vertical)
        if(begin.getX() == end.getX()){
            throw new ArithmeticException("For vertical line the gradient calculation is not available.");
        }
        return (double) (end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }

    /**
     * Method distance(int x, int y) calculates the distance from a point defined by its coordinates (x, y) to the line segment.
     * This method utilizes the formula for the shortest distance from a point to a line segment.
     *
     * @param x X-coordinate of the point
     * @param y Y-coordinate of the point
     * @return The distance from the point to the line segment as a double value
     */
    public double distance(int x, int y){
        Point point = new Point(x ,y);// Create a Point object from the coordinates
        return point.distance();//other distance method (overloaded) with the created Point object
    }

    /**
     * Method distance(Point p) calculates the distance from a given Point object (p) to the line segment.
     * This method utilizes the formula for the shortest distance from a point to a line segment.
     * @param p The Point object representing the point to calculate the distance from
     * @return The distance from the point to the line segment as a double value
     */
    public double distance(Point p) {
        // Line segment direction vector (end - begin)
        double dx = end.getX() - begin.getX();
        double dy = end.getY() - begin.getY();

        // Vector representing the point (p) relative to the beginning point of the line segment
        double projection = getProjection(p, dx, dy);

        // Calculate the closest point on the line segment to the given point
        double closestX = begin.getX() + (projection * dx);
        double closestY = begin.getY() + (projection * dy);

        // Calculate the distance between the given point and the closest point on the line segment
        return Math.sqrt(Math.pow(p.getX() - closestX, 2) + Math.pow(p.getY() - closestY, 2));
    }

    /**
     * Method intersects(Line another) determines whether the current Line segment intersects with another Line segment.
     *
     * @param another The Line object representing the other line segment
     * @return True if the line segments intersect, False otherwise
     */
    public boolean intersects(Line another) {
        // Utilize the Line-Line intersection formula

        double det =
                (this.end.getX() - this.begin.getX()) * (another.end.getY() - another.begin.getY()) -
                        (this.end.getY() - this.begin.getY()) * (another.end.getX() - another.begin.getX());

        // Check for collinearity (lines are parallel)
        if (Math.abs(det) < 1.0e-10) {
            return false;
        }

        double t =
                ((another.begin.getX() - this.begin.getX()) * (another.end.getY() - another.begin.getY()) -
                        (another.begin.getY() - this.begin.getY()) * (another.end.getX() - another.begin.getX())) / det;

        double u =
                ((this.begin.getX() - another.begin.getX()) * (this.end.getY() - this.begin.getY()) -
                        (this.begin.getY() - another.begin.getY()) * (this.end.getX() - another.begin.getX())) / det;

        // Check for intersection within line segments
        return (t >= 0 && t <= 1) && (u >= 0 && u <= 1);
    }

    /**
     * Helper method: getProjection(Point p, double dx, double dy)
     *
     * This method calculates the projection of a point vector (p) onto the direction vector of the line segment.
     * The direction vector is defined by the difference between the end and begin points of the line segment (end - begin).
     * The projection represents the closest point on the line segment to the given point (p) along the line's direction.
     *
     * @param p The Point object representing the point to calculate the projection for
     * @param dx X-component of the line segment's direction vector (end.getX() - begin.getX())
     * @param dy Y-component of the line segment's direction vector (end.getY() - begin.getY())
     * @return The projection value (between 0 and 1) representing the closest point on the line segment relative to the beginning point
     */
    private double getProjection(Point p, double dx, double dy) {
        double px = p.getX() - begin.getX();
        double py = p.getY() - begin.getY();

        // Calculate the projection of the point vector onto the direction vector
        double projection = (px * dx + py * dy) / (dx * dx + dy * dy);

        // Check if the projection is outside the line segment range (0 to 1)
        if (projection < 0) {
            projection = 0; // Distance to the beginning point
        } else if (projection > 1) {
            projection = 1; // Distance to the end point
        }
        return projection;
    }


}
