package org.example.module1.lesson22;

public class Example9 {
    public static void main(String[] args) {
        try (ResourceA1 ra = new ResourceA1(); ResourceB1 rb = new ResourceB1()) {
            String data = ra.readFrom();
            rb.write(data);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ResourceA1 implements AutoCloseable {

    public String readFrom() {
        System.out.println("read from A");

        return "data";
    }

    @Override
    public void close() throws Exception {
        System.out.println("close A");
    }
}

class ResourceB1 implements AutoCloseable {
    public void write(String data) {
        System.out.println("write to B: " + data);
    }

    @Override
    public void close() throws Exception {
        System.out.println("close B");
    }
}
