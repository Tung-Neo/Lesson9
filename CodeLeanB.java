package Lesson9;
import Lesson9.CodeLeanA;

public class CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanA().methodPublic();
        new CodeLeanA().methodProtected();
        new CodeLeanA().methodDefaul();
    }
    public void methodPublic(){}
    protected void methodProtected(){}
    void methodDefault(){}
    private void methodPrivate(){}
}
