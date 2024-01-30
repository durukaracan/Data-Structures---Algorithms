/*
  Bu projede :
   basic bir şekilde 3 node oluşturduk => node1 node2 node3
   HER NODE bir OBJECT
   Node Class ının özellikleri : bir int değer tutar ve kendisinden bir sonraki node u gösterir " next "
   bu node ları aslında " next " ile birbirine bağlamış olduk

   node lara değer verdik => value => " node1.value=11 " gibi
   ve bu node ları sırasıyla print ettirdik

 */



public class Main {
    public static void main(String[] args)
    {
        // node(düğüm) oluşturduk
       Node node1 = new Node();
       Node node2 = new Node();
       Node node3 = new Node();

       //node ların içine data koyduk (değer atadık)
       node1.value = 11;
       node2.value = 22;
       node3.value = 33;

       //node ları birbirine bağladık next ile birbirlerini gösteriyorlar
       node1.next =  node2;
       node2.next = node3;
       node3.next = null;

        //temp node u oluşturduk node1 i gösteriyo
        //temp yeni bir obje değil " new Node(); " kullanmadık çünkü
       Node temp = node1;

        //travers => düğümde dolaştık
        //temp == null olduğunda print etmeyi bırakcak.

       while( temp != null){
           System.out.println(temp.value);
           temp = temp.next;

           /* şu an temp = node1
              temp print ettikten sonra temp.next i gösterecek
              temp = temp.next ifadesi ile
              temp değişkeni bir sonraki düğümü işaret eder.
              Yani, temp.next ile geçerli düğümün sonraki düğümüne geçilir.
              bu da yukarıda belirttiğimiz şekilde olucak  " node1.next = node2 " gibi devam edicek
            */
       }
    }
}