import java.util.ArrayList;
public class tugas2 {
        String No, Item, Price, Qty, Subtotal;
        public tugas2 (String a, String b, String c, String d, String e){
            this.No =a;
            this.Item =b;
            this.Price =c;
            this.Qty =d;
            this.Subtotal =e;
        }
            public static void main(String[] args) {
            ArrayList<tugas2>student= new ArrayList<tugas2>();
            student.add(new tugas2("1","Bags","100000","2","200000"));
            student.add(new tugas2("2","Hat","20000","2","40000"));
              System.out.println("No\tItem\tPrice\tQty\tSubtotal");
              System.out.println("-----------------------------------------");
              for ( tugas2 x :student){
                System.out.println(x.No+"\t"+x.Item+"\t"+x.Price+"\t"+x.Qty+"\t"+x.Subtotal+"\t");
              }
              System.out.println("-----------------------------------------");
            }
              }
