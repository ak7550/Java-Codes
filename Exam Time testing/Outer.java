class Outer {
    private String s1="JU";

    private void show() {
        System.out.println("Outer");
        System.out.println(s1);
    }

    class Inner extends Outer {
        private String s1 = "Jadavpur University";

        private void show() {
            System.out.println("Inner");
            System.out.println(s1);
        }
    }
    
    public static void main(String[] args) {
        Outer out = new Outer();
        Inner ib = out.new Inner();
        ib.show();
        out = ib;
        out.show();
        Outer outin = out.new Inner();
        outin.show();
    }
}


