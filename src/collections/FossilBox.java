package collections;

public class FossilBox {
    Fossils [] fossilBoxContents;

    public FossilBox() {
        this.fossilBoxContents = new Fossils[10];
    }
    public void putFossils (Fossils fossils){
        for (int i=0; i<this.fossilBoxContents.length; i++){
            if (this.fossilBoxContents[i]==null){
             this.fossilBoxContents[i] = fossils;
                break;
            } else {
                System.out.println("Box full, please create a new one.");
            }
        }
    }
    public void printFossilDetails(){
        for (Fossils fossils:this.fossilBoxContents){
            System.out.println(fossils);
        }
    }
}
