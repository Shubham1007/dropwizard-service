package sampleApp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotEmpty;

public class AppConfiguration extends Configuration {
    @NotEmpty
    private String message;
    @NotEmpty
    private String firstParameter;
    @NotEmpty
    private String secondParameter;

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return this.message;
    }

    public void setFirstParameter(String firstParameter) {
        this.firstParameter = firstParameter;
    }

    public String getFirstParameter() {
        return this.firstParameter;
    }

    public void setSecondParameter(String secondParameter) {
        this.secondParameter = secondParameter;
    }

    public String getSecondParameter() {
        return this.secondParameter;
    }

}
