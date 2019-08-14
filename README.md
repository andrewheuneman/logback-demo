Logging Demo Application 

How to implement logback for use spring boot applications to report to Datadog for log consumption.  

The goal of this project is to show how to implement logging with trace Id Injection https://docs.datadoghq.com/tracing/advanced/connect_logs_and_traces/?tab=java#automatic-trace-id-injection
 for use in Datadog with spring boot 2.1.7 

Datadog docs for log collection https://docs.datadoghq.com/logs/log_collection/java/?tab=log4j

To generate an exception run the application and use curl to call the api.

To make an error happen:
curl localhost:8080/example/fail

To make a successfull call:
curl localhost:8080/example/success

