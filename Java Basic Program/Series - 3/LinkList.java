class Linklist{
      node First=null;
    
    void  addNode(int data)
    {
        node n=new node(data);
        if(First==null){
           First=n;
        }
        else{
            n.link=First;
            First=n;
        }       
    }
    void display(){
        node save=First;
        while(save.link != null){
            System.out.print(save.data+" , ");
            save=save.link;
        }
        System.out.print(save.data+" \n");
    }
    
    public static void main(String arg[]){
     Linklist l1=new Linklist();
     l1.addNode(155);
     l1.addNode(100);
     l1.addNode(200);
     l1.addNode(300);
     l1.display();
    }
}
class node{
    int data;
    node link;
    node(int data){
        this.data=data;
        this.link=null;
    }
}
