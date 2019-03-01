public class TowerOfHanoi{
    //num: number of discs
    public void tower(int num, String pole1, String pole2, String pole3)
    {
        if(num == 1) //only one disc
            System.out.println("From " + pole1 + " to " + pole3);
        else{
            tower(num-1, pole1, pole3, pole2);
            System.out.println("From " + pole1 + " to " + pole3);
            tower(num-1, pole2, pole1, pole3);  
        } 
    }
    
    public static void main(String[] args){
        TowerOfHanoi test = new TowerOfHanoi();
        System.out.println("Moving 1 disc in Tower of Hanoi game: ");
        test.tower(1, "A", "B", "C");
        System.out.println("Moving 3 discs in Tower of Hanoi game: ");
        test.tower(3, "M", "N", "P");
        System.out.println("Moving 5 disc in Tower of Hanoi game: ");
        test.tower(5, "pole1", "pole2", "pole3");
    }
}
