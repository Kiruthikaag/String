 public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( int i=0;i<=n;i++)
        {
            int n1 = n%10;
            sum=sum+n1;
            n=n/10;}
            System.out.println(sum);
            
            
            
        }
    }