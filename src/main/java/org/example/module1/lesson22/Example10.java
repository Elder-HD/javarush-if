package org.example.module1.lesson22;

public class Example10 {
    public static void main(String[] args) {
        try ( ResourceB2 rb = new ResourceB2(); ResourceA2 ra = new ResourceA2(rb)) {
            String data = ra.readFrom();
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ResourceA2 implements AutoCloseable {

    private final ResourceB2 resourceB2;

    ResourceA2(ResourceB2 resourceB2) {
        this.resourceB2 = resourceB2;
    }

    public String readFrom() {
        System.out.println("read from A");

        System.out.println("go to resource B");

        String result = resourceB2.readFrom();

        return result;
    }

    @Override
    public void close() throws Exception {
        System.out.println("close A");
    }
}

class ResourceB2 implements AutoCloseable {
    public String readFrom() {
        System.out.println("read from B");

        return "data";
    }

    @Override
    public void close() throws Exception {
        System.out.println("close B");
    }
}
