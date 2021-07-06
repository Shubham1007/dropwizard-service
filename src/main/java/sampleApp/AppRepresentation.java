package sampleApp;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;


public class AppRepresentation {
    @Length(max=3)
    private String message;

    public AppRepresentation(){

    }
    @JsonProperty
    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public AppRepresentation(String message){
        this.message = message;
    }

}
