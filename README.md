# sample_dropwizard_web_service

This is a sample dropwizard web service.


## Tools and Package Required
1. Java
2. Maven
3. Dropwizard

## Setup Instructions -
1. Clone this Repo: git clone https://github.com/Shubham1007/sample_dropwizard_web_service.git 
2. Run mvn command: mvn package
3. Run web service:  java -jar target/dropWizardSample-1.0-SNAPSHOT.jar server data.yml 

## API Endpoints: 

This GET API endpoint return greeting message - 

1. Without Query Params - http://localhost:8080/v1/resource 
2. With Query Params - http://localhost:8080/v1/resource?first=shubham&&second=doing 
