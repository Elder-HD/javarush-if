package org.example.module1.lesson22;

public class Example11 {
    public static void main(String[] args) {
        try (ResourceA3 ra = new ResourceA3(new ResourceB3())) {
            String data = ra.readFrom();
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ResourceA3 implements AutoCloseable {

    private final ResourceB3 resourceB;

    ResourceA3(ResourceB3 resourceB) {
        this.resourceB = resourceB;
    }

    public String readFrom() {
        System.out.println("read from A");

        System.out.println("go to resource B");

        String result = resourceB.readFrom();

        return result;
    }

    @Override
    public void close() throws Exception {
        System.out.println("close A");
//        resourceB.close();
    }
}

class ResourceB3 implements AutoCloseable {
    public String readFrom() {
        System.out.println("read from B");

        return "data";
    }

    @Override
    public void close() throws Exception {
        System.out.println("close B");
    }
}
