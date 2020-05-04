class Demo
{
    public static void main(String[] args) {
        String s1="ak";
        String s2="Bk";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.append(true);
        s.append(12);
        System.out.println(s.toString());
        s.insert(1, "ak");
        int a=s1.charAt(0);
    }
}