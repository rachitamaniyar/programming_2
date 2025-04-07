package Icebreaker;

import java.util.ArrayList;
import java.util.List;

public class Favourite {
    private Medium medium;
    private String title;
    private String comment;

    public Favourite(Medium medium, String title) {
        this.medium = medium;
        this.title = title;
    }

    public Medium getMedium() {
        return medium;
    }


    public String getTitle() {
        return title;
    }


    public String getComment() {
        return comment;
    }

    public Favourite(Medium medium, String title, String comment) {
        this.medium = medium;
        this.title = title;
        this.comment = comment;
    }

}

