class countelements{
    public static void main(String [] args){
        String name="kaki_harin8558!";
        int vo=0,con=0,dig=0,spcl=0;
        name=name.toLowerCase();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                    vo++;

                }else{
                    con++;
                }
            }else if(ch>='0'&& ch <='9'){
                dig++;

            }else{
                spcl++;
            }

        }
        System.out.println("vowels in the string are "+ vo);
        System.out.println("consonants in the string are "+ con);
        System.out.println("digits in the string are "+dig);
        System.out.println("spcial charecters in the string are "+ spcl);

    }
}