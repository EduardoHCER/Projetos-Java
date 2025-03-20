class ExemploInt{
    
    
    public static void linha(int x)
    {
        //System.out.print("*****");
        for(int i =0;i < x;i++){
            System.out.print("*");
        }
    }

    public static void main(String[]args){
        
    Scanner input = new Scanner (System.in);
    
    System.out.printf("Impressao do metodo linha\n");
    linha(15);
    }
}