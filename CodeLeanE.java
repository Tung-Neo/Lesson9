package Lesson9;
import Lesson9.CodeLeanB;

public class CodeLeanE extends CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected();
        new CodeLeanE().methodProtected();
    }
}
