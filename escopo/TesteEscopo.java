public class TesteEscopo {
    
    public static void main(String args[]) {
        TesteEscopo teste = new TesteEscopo();
        teste.executar();
    }
    
    public void executar() {
        A a = new A();
        B b = new B();
        C c = new C();
        
        System.out.println("\nA:");
        a.printX();

        System.out.println("\nB:");
        b.printX();
        
        System.out.println("\nC:");
        c.printX();
        
        System.out.println();
        a.printX_dinamico();
        b.printX_dinamico();
        c.printX_dinamico();
    }
    
    class Print {
        
        String x = "-1";
        
        void printX_statico() {
            char x = '0';
            System.out.println("(Estatico) X: "+ x);
        }
        
        void printX_dinamico() {
            char x = '0';
            System.out.println("(Dinamico) X: "+ this.x);
        }
        
        void printX() {
            printX_statico();
            
            printX_dinamico();
            
            this.printX_dinamico();
            this.x = this.x + " (alterado)";
        }
        
    }
    
    class A extends Print { String x = "A"; }
    
    class B extends Print { String x = "B"; }
    
    class C extends Print { }
}
