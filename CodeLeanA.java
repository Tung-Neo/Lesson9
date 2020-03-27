package Lesson9;

public class CodeLeanA {
    public void methodPublic(){
        methodPrivate();
    }
    protected void methodProtected(){
        methodPrivate();
    }
    void methodDefaul(){
        methodPrivate();
    }
    private void methodPrivate(){}
}
