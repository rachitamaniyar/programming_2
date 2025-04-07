package collections;

public class Box {
    Book [] bookBoxContents;

    public Box() {
        this.bookBoxContents = new Book[10];
    }
    public void putBook (Book book){
        for (int i=0; i<this.bookBoxContents.length; i++){
            if (this.bookBoxContents[i]==null){
                this.bookBoxContents[i]=book;
                break;
            } else {
                System.out.println("Box full, please create a new one.");
            }
        }
    }
    public void printBooks(){
        for (Book book:this.bookBoxContents){
            System.out.println(book);
        }
    }
}
