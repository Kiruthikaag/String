 public static void main(String[] args) {
        // TODO code application logic here
        int n,k=0,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( int i=1;i<=n;i++){
             k=k*10;
            t=k+n%10;
           
            n=n/10;
            
        
        System.out.println(t);
    }
}