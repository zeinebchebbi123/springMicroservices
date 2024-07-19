# # Use an OpenJDK image as the base image
# FROM openjdk:11-jre-slim
#
# # Set the working directory
# WORKDIR /app
#
# # Copy the jar file into the container
# COPY target/eureka-server.jar /app/eureka-server.jar
#
# # Expose port 8761
# EXPOSE 8761
#
# # Command to run the jar file
# ENTRYPOINT ["java", "-jar", "/app/eureka-server.jar"]
# #