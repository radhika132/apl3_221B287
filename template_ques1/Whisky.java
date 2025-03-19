class Whisky{
    private void pour(){
        System.out.println("pour 30ml of Whisky in a glass");
        }
        
        private void add_Condiment(){
        System.out.println("add some ice");
        }
        
        private void stir(){
        System.out.println("stir for 30 sec");
        }
        
        private void serve(){
        System.out.println("serve through waiter");
        
        }


public void template_Method (){
    pour();
    add_Condiment();
    stir();
    serve();
    } 
}