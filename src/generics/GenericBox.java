package generics;

public class GenericBox <T>{
    private T [] contents;

    public GenericBox() {
        contents = (T[]) new Object[10];
    }
    public void putItem (T item){
        for (int i=0; i< contents.length; i++){
            if (contents [i]==null){
                contents[i] = item;
                break;
            }
        }
    }
    public void printContents (){
        for (T t:this.contents){
            System.out.println("Object "+ t);
        }
    }
}
