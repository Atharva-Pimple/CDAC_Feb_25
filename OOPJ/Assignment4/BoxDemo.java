public class BoxDemo {

    public static void main(String[] args) {
        Box box1 = new Box(3, 4, 5);
        System.out.println("Box 1 Volume: " + box1.getVolume());
        System.out.println("Box 1 Surface Area: " + box1.getArea());

        System.out.println("=======================");
        Box box2 = new Box(7, 8, 9);
        System.out.println("Box 2 Volume: " + box2.getVolume());
        System.out.println("Box 2 Surface Area: " + box2.getArea());

        
    }
}

class Box {
    int height;
    int breadth;
    int width;

    public Box(int height, int breadth, int width) {
        this.height = height;
        this.breadth = breadth;
        this.width = width;
    }

    long getVolume(){
        return height*width*breadth;
    }

    long getArea(){
        return 2*(height*breadth + breadth*width + height*width);
    }
    
}