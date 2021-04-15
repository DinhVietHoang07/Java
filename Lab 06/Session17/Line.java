package Session17;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end){
        this.begin = begin;

    }
    public Line (int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX, beginY);
    }

}
