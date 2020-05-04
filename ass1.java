class Room
{
    float height,width,bread;
    Room()
    {
        height=width=bread=0;
    }
    Room(float h, float w, float b)
    {
        height=h;
        width=w;
        bread=b;
    }
    float volume()
    {
        return height*width*bread;
    }
}
class RoomDemo
{
    public static void main(String args[])
    {
        Room rooms=new Room(12,13,14);
        System.out.println("Volume of the room is: "+ rooms.volume());
    }
}