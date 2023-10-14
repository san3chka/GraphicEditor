interface Shape {
    void printName();
}

class Circle implements Shape {
    private static final String NAME = "Circle";
    @Override
    public void printName() {
        System.out.println(NAME);
    }
}

class Quad implements Shape {
    private static final String NAME = "Quad";
    @Override
    public void printName() {
        System.out.println(NAME);
    }
}

class Triangle implements Shape {
    private static final String NAME = "Triangle";
    @Override
    public void printName() {
        System.out.println(NAME);
    }
}

class Square implements Shape {
    private static final String NAME = "Square";
    @Override
    public void printName() {
        System.out.println(NAME);
    }
}

class Rectangle implements Shape {
    private static final String NAME = "Rectangle";
    @Override
    public void printName() {
        System.out.println(NAME);
    }
}