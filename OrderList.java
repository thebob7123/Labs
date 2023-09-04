import java.util.ArrayList;

public class OrderList {
    private Order[] orderList = new Order[10];
    public void addOrder(Order order){
        for (int i = 0; i < orderList.length; i++){
            if (orderList[i] == null){
                orderList[i] = order;
            } else {

            }
        }
    }
    public void removeOrder(int nun){
        for (int i = 0; i < orderList.length; i++){
            Order od = orderList[i];
            if (nun == od.getID()){
                orderList[i] = null;
            }
        }
    }
    public void readyOrder(int id){
        /*for (int i = 0; i < orderList.size(); i++){
            Order od = orderList.get(i);
            if (id == od.getID()){
                od.ready = true;
            }
        }*/
        for (Order od: orderList){
            if (id == od.getID()){
                od.ready = true;
            }
        }
    }

    private void sortOrders(){
        Order od1 = orderList[0];
        int largest = od1.getID();

        for(int i = 0; i < orderList.length; i++){
            Order od = orderList[i];
            if (orderList[i] == null){

            } else if (od.getID() > largest){
                orderList[i] = null;
                addOrder(od);
                largest = od.getID();
            }
        }
        System.out.println(orderList);
    }
    public String printOrder(int id){
        for (int i = 0; i < orderList.length; i++){
            Order od = orderList[i];
            if (id == od.getID()){
                return od.toString();
            } else {
                return " ";
            }
        }
        return " ";
    }
    public String printOrders(){
        ArrayList<Integer> ready = new ArrayList<Integer>();
        ArrayList<Integer> preparing = new ArrayList<Integer>();
        sortOrders();
        for (int i = 0; i < orderList.length; i++){
            Order od = orderList[i];
            if (od.ready){
                ready.add(od.getID());
            } else {
                preparing.add(od.getID());
            }
        }
        return "Ready" + '\n' + ready + "\n" + "Preparing" + "\n" + preparing;
    }
}
