class Variables{
    public static void main(String[] args) {
        byte numb1=-128,numb2=127;
        short nums1=-32768,nums2=32767;
        int numi1=-2147483648,numi2=2147483647;
        long numl1=-9223372036854775808l,numl2=9223372036854775807l;
        float numf=1234.1234567f;
        double numd=1234.123456789101112;
        boolean bool1=true,bool2=false;
        char ch1='A',ch2=97;
        String str="My name is M.Ismail";
        System.out.println("Printing byte's smallest value:"+numb1);
        System.out.println("Printing byte's largest value:"+numb2);
        System.out.println("Printing short's smallest value:"+nums1);
        System.out.println("Printing short's largest value:"+nums2);
        System.out.println("Printing int's smallest value:"+numi1);
        System.out.println("Printing int's largest value:"+numi2);
        System.out.println("Printing long's smallest value:"+numl1);
        System.out.println("Printing long's largest value:"+numl2);
        System.out.println("Printing float value:"+numf);
        System.out.println("Printing double value:"+numd);
        System.out.println("Printing boolean value:"+bool1);
        System.out.println("Printing boolean value:"+bool2);
        System.out.println("Printing char value:"+ch1);
        System.out.println("Printing char value using ASCII code:"+ch2);
        System.out.println("Printing String:"+str);
    }
}