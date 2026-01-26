package org.intmo.lesson3;

public class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!».");
        System.out.println(study.printCourse());

        Object object1 = new Object("Зеленый", 2.50);
        Object object2 = new Object("Красный", 3.50);
        System.out.println(object1.toString());
        System.out.println(object2.toString());

        House house1 = new House();
        House house2 = new House();
        house1.printCourse(8, 2025, "Дом");
        house2.printCourse(10, 2005, "Квартира");
        System.out.println(house1.toString());
        System.out.println(house2.toString());

        Tree tree1 = new Tree(150, "Береза");
        Tree tree2 = new Tree(200, true, "Сосна");
        Tree tree3 = new Tree();
        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}

