import java.util.*; //import statement

class AddSubstractLargeNo { // class Description
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in);
        String FirstNumber,m1,m2,SecondNumber,n="",s,d,c="0",ch1,ch2;
        int r;char s1='+',s2='+',sign='+',check;
        System.out.print("Enter First Number : ");
        FirstNumber=sc.nextLine();
        System.out.print("Enter Second Number : ");
        SecondNumber=sc.nextLine();
        if (FirstNumber.charAt(0)=='-'){
            s1='-';
            FirstNumber=FirstNumber.substring(1);
        }if (SecondNumber.charAt(0)=='-'){
            s2='-';
            SecondNumber=SecondNumber.substring(1);
        }
        m1=FirstNumber;m2=SecondNumber;
        if (FirstNumber.length()>=SecondNumber.length()){
            r=FirstNumber.length()-SecondNumber.length();
            while (r>0){
                SecondNumber="0"+SecondNumber;
                r--;
            }
        }
        else{
        r=SecondNumber.length()-FirstNumber.length();
        while (r>0){
            FirstNumber="0"+FirstNumber;
            r--;
        }
        }
        for(int i=FirstNumber.length()-1;i>=0;i--){
            s="";
            ch1=""+FirstNumber.charAt(i);
            ch2=""+SecondNumber.charAt(i);
            if((s1=='-' && s2=='-') || (s1=='+' && s2=='+')){
                s+=Integer.parseInt(ch1+"")+Integer.parseInt(ch2+"")+Integer.parseInt(c+"");
                c="0";
                if((s1=='-' && s2=='-'))
                sign='-';
            }
            if((s1=='+' && s2=='-') || (s1=='-' && s2=='+')){
                if (m1.length()>m2.length() || (m2.length()==m1.length()  &&  m1.charAt(0)>m2.charAt(0))){
                    if(s1=='-')
                    sign='-';
                    if(Integer.parseInt(ch1)<Integer.parseInt(ch2) || (Integer.parseInt(ch1)==Integer.parseInt(ch2)&& !c.equals("0"))){
                        s+=Integer.parseInt("1"+ch1+"")-Integer.parseInt(ch2+"")+Integer.parseInt(c+""); 
                        c="-1";
                    }else{
                        s+=Integer.parseInt(ch1+"")-Integer.parseInt(ch2+"")+Integer.parseInt(c+"");
                        c="0";
                        
                    }
                }else{
                    if(s2=='-')
                    sign='-';
                    if(Integer.parseInt(ch1)>Integer.parseInt(ch2) || (Integer.parseInt(ch1)==Integer.parseInt(ch2)&& !c.equals("0"))){
                        s+=Integer.parseInt("1"+ch2+"")-Integer.parseInt(ch1+"")+Integer.parseInt(c+""); 
                        c="-1";
                    }else{
                        s+=Integer.parseInt(ch2+"")-Integer.parseInt(ch1+"")+Integer.parseInt(c+"");
                        c="0";

                    }
                }
            }
            if(s.length()==2){
                c=s.charAt(0)+"";d=s.charAt(1)+"";
            }
            else{
                d=s; 
            }
            n=d+n;

        }
        n=(c.equals("0")?"":c)+n;
        check=n.charAt(0);
        while(check=='0'){
            if(n.length()>=2)
            n=n.substring(1);
            else
            break;
            check=n.charAt(0);
        } 
        n=(sign=='+'?"":sign)+(c.equals("0")?"":c)+n;
        if(n.length()==2 && n.charAt(1)=='0')
        n=""+n.charAt(1);
        System.out.println("Ans = "+n);
    }

    
} // class End