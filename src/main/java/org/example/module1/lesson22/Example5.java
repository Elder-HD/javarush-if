package org.example.module1.lesson22;

public class Example5 {
    public static void main(String[] args) throws Exception {
        boolean isThrow = true;
        System.out.println(".....");
        System.out.println("start");

        try {
            if (isThrow) {
                throw new Exception("1");
            }
        } catch (Exception e){
            throw new RuntimeException("2", e);
        }
    }
}
