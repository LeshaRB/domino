# How to run

- #### run `gradle clean build` to build

- #### run `gradle clean build fastRun` to fast build without checkstyles, findBugs and PMD

- #### Run for development :

  - ##### For super dev mode 
  
    - In one terminal run `mvn gwt:codeserver -pl *-frontend -am`
    
    - In another terminal `cd portal-backend`
    - execute `mvn exec:java`
    - the server port will be printed in the logs access the application on `http://localhost:[port]`

  - ##### For gwt compiled mode 
  
    - `cd portal-backend`
    - execute `mvn exec:java -Dmode=compiled`
    - the server port will be printed in the logs access the application on `http://localhost:[port]`

  - ##### For production mode 
  
    - `cd portal-backend`
    - execute `java -jar target/portal-backend-1.0-SNAPSHOT-fat.jar`
    - the server port will be printed in the logs access the application on `http://localhost:[port]`
