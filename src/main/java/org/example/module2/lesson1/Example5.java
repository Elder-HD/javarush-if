package org.example.module2.lesson1;

public class Example5 {
    public static void main(String[] args) throws Exception {
        SuperExecutor superExecutor = new SuperExecutor();
        SuperExecutor subExecutor = new SubExecutor();
        SuperExecutor subExecutor2 = new SubExecutor2();

        subExecutor.method(null);
//        subExecutor.method2();  // using super class reference type we cannot get method2
        ((SubExecutor)subExecutor).method2();
        ((SubExecutor)subExecutor2).method2();
   }
}

class Result {

}

class ResultA extends Result {

}

class MyException extends Exception {

}

class Param {

}

class AParam extends Param {

}

class SuperExecutor {
    protected Result method(Param param) throws Exception {

        if (param == null) {
            throw new Exception();
        }
        return new ResultA();
    }
}

class SubExecutor extends SuperExecutor {
    @Override
    public ResultA method(Param param) throws MyException {

        return null;
    }


    public void method2(){}
}

class SubExecutor2 extends SuperExecutor{

    @Override
    public Result method(Param param) throws Exception {
        return super.method(param);
    }
}