package Nasledovanie;

 class Test3 extends Test4 {
    private int course = 1;

     Test3 (int height, String name, int course){
        super(height,name);
        this.course = course;
    }

    void tell(){
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }
}
