public class JavaSem2HW {
    public static void main(String[] args) {

        int a = 3;
        int b = 56;

        StringBuilder sb = new StringBuilder();
        sb.append(12);
        sb.append('c');
        sb.append("Word.");
        sb.append(true);
        sb.append(12.44);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(12);
        sb2.append('c');
        sb2.append("Word.");
        sb2.append(true);
        sb2.append(12.44);

        System.out.println(sb == sb2);
        System.out.println(sb.toString().equals(sb2.toString()));
    }
}
