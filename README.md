# sample_dropwizard_web_service

This is a sample dropwizard web service.

## Steps -
1. Clone this Repo: git clone https://github.com/Shubham1007/sample_dropwizard_web_service.git 
2. Run mvn command: mvn package
3. Run web service:  java -jar target/dropWizardSample-1.0-SNAPSHOT.jar server data.yml 

## API Endpoints: 

1. This GET API endpoint return greeting message - http://localhost:8080/v1/resource 
2. This GET API endpoint return greeting message along with accepts 2 query params. - http://localhost:8080/v1/resource?first=shubham&&second=doing 
