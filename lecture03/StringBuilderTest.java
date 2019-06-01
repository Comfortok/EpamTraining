package kz.epam.khassenov.lecture03;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("fsdfsd");
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb.capacity());
        sb2.append("test");
        sb2.insert(2, "ololol");
        System.out.println(sb);
        System.out.println(sb2);
    }
}
