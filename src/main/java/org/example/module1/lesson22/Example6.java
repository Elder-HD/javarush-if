package org.example.module1.lesson22;

public class Example6 {
    public static void main(String[] args) throws InterruptedException {
        boolean isThrow = true;
        System.out.println(".....");
        System.out.println("start");

        try {
            if (isThrow) {
                throw new Exception("1");
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("===================");
            StackTraceElement[] stackTrace = e.getStackTrace();

//            Thread.sleep(1000);
            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println(stackTraceElement);
            }
        }
    }
}
