public class StringCharat {
    public static void main(String[] args) {
        char s1[]={'r','e','v','a','n','t','h' };
        System.out.println(s1);

        String s2=new String();
        s2="revanth";
        System.out.println(s2);

        String s3=new String();
        s3="revanth";
        char ch=s3.charAt(3);
        System.out.println(ch);

        String s4=new String();
        s4="sai kiran";
        System.out.println(s4.compareTo(s2));

        String s5=new String();
        s5="revanth";
        System.out.println(s5.endsWith("t"));

        System.out.println(s1.equals(s2));

        System.out.println(s2.equalsIgnoreCase(s4));

        String s6=new String();
        s6=String.format("d",141);
        System.out.println(s6);

        String s7=new String();
        s7 = "REVANTH";
        byte[] br=s7.getBytes();
        for(int i=0;i<br.length;i++){
            System.out.println(br[i]);
        }

        String s8=new String();
        s8="revanth kumar naidu";
        char cr[]=new char[25];
        try{
            s8.getChars(1,23,cr,0);
            System.out.println(cr);
        }catch (Exception r){
            System.out.println(r);
        }

        String s9=new String();
        s9="revanth kumar naidu";
        System.out.println(s9.indexOf("kumar"));

        String s10=new String();
        s10="revanth";
        String s11=new String();
        s11="revanth";
        s10.intern();
        s11.intern();
        System.out.println(s10==s11);

        System.out.println(s10.isEmpty());

        String s12=new String();
        s12=null;
        s12=String.join(":",null,"good morning","wake up");

        System.out.println(s11.lastIndexOf('h'));

        System.out.println("string lenght" +s11.length());

        String s13=new String();
        s13=s11.replace('v','u');
        System.out.println(s13);

        String s14=new String();
        s14=s9.replaceAll("a","e");
        System.out.println(s14);

        System.out.println(s9.split("\\s"));

        System.out.println(s9.startsWith("re"));

        System.out.println(s11.substring(3,5));

        String s15=new String();
        s15="revanth";
        char ca[]=s15.toCharArray();
        int len= ca.length;
        System.out.println("char array length "+len);
        System.out.println("char array elements:" );
        for(int i=0;i<len;i++){
            System.out.println(ca[i]);
        }

        String s16=new String();
        s16="REVANTH";
        System.out.println(s16.toLowerCase());

        System.out.println(s11.toUpperCase());

        String s17=new String();
        s17=" revanth  kumar  naidu ";
        System.out.println(s17.trim());

        boolean sl=true;
        boolean se=false;
        String s18=String.valueOf(sl);
        String s19=String.valueOf(se);
        System.out.println(sl);
        System.out.println(se);
    }
}

