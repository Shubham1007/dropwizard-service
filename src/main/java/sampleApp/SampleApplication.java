package sampleApp;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SampleApplication extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new SampleApplication().run(new String[]{"server", "src/main/resources/data.yml"});
    }


    public void run(AppConfiguration configuration, Environment environment) {
        final AppResource resource = new AppResource(configuration.getMessage(),
                configuration.getFirstParameter(), configuration.getSecondParameter());
        environment.jersey().register(resource);
    }
}
