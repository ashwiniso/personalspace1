import java.util.List;import java.util.ArrayList;

public class arrayl {

    static List<Integer> items = new ArrayList<Integer>();

    public arrayl(List<Integer> items) {
        this.items  = items;
    }
    
    public List<Integer> getItems() {
        return items;

    }


    public static void main(String[] args){
        ArrayList lis  = new ArrayList<Integer>();
        lis.add(3);
        lis.add(4);
        lis.add(23);
        
        arrayl list1 = new arrayl(lis);

        System.out.println(list1.getItems());

    }


 



}
