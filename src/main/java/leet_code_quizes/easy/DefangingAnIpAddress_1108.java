package leet_code_quizes.easy;

public class DefangingAnIpAddress_1108 {

    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println("DefangIpAddress: " + defangIPaddr(address));
        System.out.println("DefangIpAddress: " + defangIPaddrUsingStringReplace(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (Character ch: address.toCharArray()){
            sb.append(ch == '.' ? "[.]" : ch);
        }

        return sb.toString();
    }

    public static String defangIPaddrUsingStringReplace(String address) {
        return address.replace(".", "[.]");
    }
}
