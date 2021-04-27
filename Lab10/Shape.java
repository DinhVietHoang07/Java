/**
 * @(#)Shape.java
 *
 *
 * @author
 * @version 1.00 2009/1/19
 */
package Lab09;

public abstract class Shape {
    /**
     * @(#)Line.java
     *
     *
     * @author
     * @version 1.00 2021/1/19
     */

    public class Line extends Shape {
        private int length;
        public Line(int length) {
            this.length=length;
        }

        public Line() {
             this.length=length;
        }

        public int getLength() {
            return length;
        }
        public void setLength(int value) {
            this.length=value;
        }
        public void draw() {
            for(int i=0;i<length;i++) {
                System.out.print("-");
            }
        }
    }
    /**
     * @(#)Main.java
     *
     *
     * @author
     * @version 1.00 2021/1/3
     */

    public class Main {
        /**
         * @param args the command line arguments
         */
        public void main(String[] args) {
// TODO code application logic here
            Shape line = new Line();
            ((Line) line).draw();
        }
    }
}
