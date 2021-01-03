package company.lamdas;

public abstract class MyTemplateMethodImplementation {
    public void doSomething() {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        System.out.println(getString());

        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
    }

    protected abstract String getString();

    public static void main(String args[]) {
        new TwoTemplateImplementation().doSomething();
    }
}

class OneTemplateImplementation extends MyTemplateMethodImplementation {
    @Override
    protected String getString() {
        return "one";
    }
}

class TwoTemplateImplementation extends MyTemplateMethodImplementation {
    @Override
    protected String getString() {
        return "two";
    }
}
