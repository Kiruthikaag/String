 public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
     if((n%4==0)||(n%400==0)&&(n%100!=0))
     { 
         System.out.println("leap");
     }
         else
     {
         System.out.println("not");
     }  } 