class Box
{
    float height, width, breadth;
    Box()
    {
        height=width=breadth=0;
    }
    Box(float h, float w, float b)
    {
        height=h;
        width=w;
        breadth=b;
    }
    float getVolume()
    {
        return height*width*breadth;
    }
    float getArea()
    {
        return width*breadth;
    }
    public static void main(String args[])
    {
        Box b1=new Box();
        Box b2=new Box(14,12,15);
        System.out.println("Volume of the 1st box is: "+ b1.getVolume() +" Surface Area of the 1st box is: "+ b1.getArea());
        System.out.println("Volume of the 2nd box is: "+ b2.getVolume() +" Surface Area of the 2nd box is: "+ b2.getArea());
    }

}