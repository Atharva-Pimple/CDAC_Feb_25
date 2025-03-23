class RoomDemo{
    public static void main(String[] args) {
        Room r=new Room(10, 15, 20);
        System.out.println("Volume of room: "+r.volume()+" sq.ft");
    }
}

class Room {
    int height;
    int width;
    int breadth;

    public Room(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    long volume(){
        return this.height * this.width * this.breadth;
    }
    
}

