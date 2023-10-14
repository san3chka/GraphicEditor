interface Shape {
    void printName(String name);
}

class ShapeNameFormatter implements Shape{
    //проходим switch-case по enum классу ShapeName и получаем геометрическую фигуру
    private String getShapeName(ShapeName shapeName) throws IllegalArgumentException {
        switch (shapeName) {
            case circle: return "Circle";
            case quad: return "Quad";
            case triangle: return "Triangle";
            case square: return "Square";
            case rectangle: return "Rectangle";
        }
        return "";
    }

    //выводим геометрическую фигуру в консоль
    @Override
    public void printName(String name) {
        try {
            System.out.println(getShapeName(ShapeName.valueOf(name.toLowerCase())));
        }catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("неправильная фигура. проверьте пожалуйста ввод в formatter.printName()");
        }
    }
}
