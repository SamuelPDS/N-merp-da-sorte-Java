public class númerodasorte {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int valor = 0;
do {
    System.out.println("Insira um número");
valor = sc.nextInt();
if (valor ==7)
    System.out.println("Que sorte!");    

else if (valor==13)

    System.out.println("Esse valor dá azar!");    

else
    System.out.println("O número escolhido não traz azar nem sorte");    

}
while(valor!=0); 
sc.close();
}
}
