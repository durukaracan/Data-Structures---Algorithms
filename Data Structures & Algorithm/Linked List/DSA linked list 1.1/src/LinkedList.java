public class LinkedList {

    // bizim için linked list te en önemli kısım Head'i tutabilmek
    // bir Node Head oluşturduk
    Node head = null;
    Node tail = null;

    // listeye node ekleyecek int x oluştuğurduğumuz node un datasına gidecek
    void add (int x){
        Node eleman = new Node(); // eklenecek olan node
        eleman.data = x;
        eleman.next = null;

        if( head == null ){      //liste oluşmamış demek

            head = eleman;
            // head e eleman atadık
            tail = eleman;
            System.out.println("liste oluşturuldu ve ilk node(obje) eklendi");
        }
        else{   // head var ve liste oluşmuş ise
            tail.next = eleman; // son elemanın devamına yeni node ekledim
            tail = eleman;  //tail (son node u) güncelledim
            System.out.println("listenin sonuna yeni bir eleman ' "  + tail.data + " ' eklendi");
        }

    }

    void print(){
        if (head == null){
            // liste boş yazdıracak bir şey yok
            System.out.println("liste boş");
        }
        else {
            Node temp = head;

            System.out.print("\nhead --> ");    // head olan node u belirtmek için
            //birbirine bağlı şekilde bastırmak için bir önceki javada var
            while ( temp != null){

                System.out.print(temp.data + " --> ");
                temp = temp.next;

            }
            System.out.println(" null.\n");  // tail olan node u belirtmek için

        }
    }
}
