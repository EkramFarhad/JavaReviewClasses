package review9_Interface;

public interface Drawable {

    //interface is collection of public static final variables and public abstract methods
        String TOOL="Pencil";   //by default public static final
        // usually constant we write with upper case
        void draw();  //by default this method is public abstract
        //above is how Interface used to be before Java 8
        //after Java 8 static and default methods were added to the Interface
        default  void print(){
            System.out.println("We are drawing object using "+TOOL);
        }
        static void erase(){
            System.out.println("All drawings is erasable");
        }
    }
    class Rectangle extends Shape implements Drawable{
        Rectangle(String color,double width,double length){
            super(color, width, length);
        }
        @Override
        public double calculateArea() {
            return length*width;
        }

        public void draw(){
            System.out.println("I am drawing rectangle");
        }
    }
    abstract class Shape{
        public String color;
        protected double width,length;
        Shape(String color,double width,double length){
            this.color=color;
            this.width=width;
            this.length=length;
        }
        public abstract double calculateArea();
    }
    class Square implements Drawable{
        public void draw(){
            System.out.println("I am drawing Square");
        }
    }

