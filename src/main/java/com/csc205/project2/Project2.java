package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public abstract class Project2 implements FourDimensionalShape {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        /*ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);*/

        /*
        The following code works with the code given.
         */

        Sphere sphere = new Sphere(2.0) {
            @Override
            public void FourDimensionalShape() {

            }
        };
        System.out.println(sphere);

        Cube Cube= new Cube(5.0);
        System.out.println(Cube);

        Cylinder Cylinder;
        Cylinder = new Cylinder(4.0, 1.0) {
            @Override
            public void FourDimensionalShape() {

            }
        };
        System.out.println(Cylinder);

        Rectangularprism Rectangularprism;
        Rectangularprism = new Rectangularprism(4.0, 8.0, 6.0) {
            @Override
            public void FourDimensionalShape() {

            }
        };
        System.out.println(Rectangularprism);
    }
}
