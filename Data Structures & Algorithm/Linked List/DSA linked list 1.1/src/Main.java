public class Main {
    public static void main(String[] args) {

       /* bir önceki java da yaptığımız kısımlar:

        //Node (Obje) oluşturduk
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        Node D = new Node();

        //Node lara veri girdik
        A.data = 11;
        B.data = 22;
        C.data = 33;
        D.data = 44;

        // node ları birbirine bağladık
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = null;

        */
        LinkedList list = new LinkedList();

        list.add(11);
        list.print();
        System.out.println("--------------------------------------------");
        //anlık output: liste oluşturuldu ve ilk node(obje) eklendi
        /*
                       head --> 11 -->  null.
                       --------------------------------------------
         */




        list.add(22);
        list.print();
        System.out.println("--------------------------------------------");
        //anlık output: liste oluşturuldu ve ilk node(obje) eklendi
        /*
                       head --> 11 -->  null.
                       --------------------------------------------
                       listenin sonuna yeni bir eleman ' 22 ' eklendi

                       head --> 11 --> 22 -->  null.
                       --------------------------------------------
         */



        list.add(33);
        list.print();
        System.out.println("--------------------------------------------");
        //anlık output: liste oluşturuldu ve ilk node(obje) eklendi
        /*
                       head --> 11 -->  null.
                       --------------------------------------------
                       listenin sonuna yeni bir eleman ' 22 ' eklendi

                       head --> 11 --> 22 -->  null.
                       --------------------------------------------
                       listenin sonuna yeni bir eleman ' 33 ' eklendi

                       head --> 11 --> 22 --> 33 -->  null.
                       --------------------------------------------
         */



        list.add(44);
        list.print();
        System.out.println("--------------------------------------------");
        //anlık output: liste oluşturuldu ve ilk node(obje) eklendi
        /*
                       head --> 11 -->  null.
                       --------------------------------------------
                       listenin sonuna yeni bir eleman ' 22 ' eklendi

                       head --> 11 --> 22 -->  null.
                       --------------------------------------------
                       listenin sonuna yeni bir eleman ' 33 ' eklendi

                       head --> 11 --> 22 --> 33 -->  null.
                       --------------------------------------------
                       listenin sonuna yeni bir eleman ' 44 ' eklendi

                       head --> 11 --> 22 --> 33 --> 44 -->  null.
                      --------------------------------------------
                      HEAD = 11      TAIL = 44
         */










    }
}