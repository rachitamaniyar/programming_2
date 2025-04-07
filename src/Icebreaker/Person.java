package Icebreaker;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private List<Favourite> favourite;

    public Person(String firstName, String lastName, List <Favourite> favourite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favourite = favourite;
    }

    public String introduceMe(){
       String intro = "My name is "+ firstName +" "+ lastName+".";
        if (!favourite.isEmpty()){
            if (favourite.size()==1){
                intro = intro +"\n" + "My favourite thing is ";
            }
            else{
                intro = intro +"\n" + "My favourite things are ";
            }
            for (Favourite favourites:favourite){
                intro = intro +" a "+favourites.getMedium()+" called "+ favourites.getTitle()+ ".";
                if (favourites.getComment()!=null){
                    intro = intro + favourites.getComment()+"\n";
                }
            }
        }
        return intro;
    }
}
