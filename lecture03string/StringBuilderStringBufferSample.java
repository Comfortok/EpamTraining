package kz.epam.khassenov.lecture03string;

public class StringBuilderStringBufferSample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java StringBuilder");
        System.out.println("StringBuilder1: " + stringBuilder);
        stringBuilder.append(" Example (append) ");
        System.out.println("StringBuilder2: " + stringBuilder);
        stringBuilder.append(" ava");
        stringBuilder.setCharAt(stringBuilder.length()-4, 'J');
        System.out.println("StringBuilder3: " + stringBuilder + " (setCharAt)");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Java StringBuffer");
        System.out.println("StringBuffer1: " + stringBuffer);
        stringBuffer.insert(4, " with");
        System.out.println("StringBuffer2: " + stringBuffer + " (insert)");
    }
}
