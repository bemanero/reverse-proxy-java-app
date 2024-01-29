FROM eclipse-temurin 
WORKDIR //usr/src
COPY //target/eportal-0.0.1-SNAPSHOT.jar eportal.jar 
EXPOSE 8080
CMD ["java","-jar","/usr/src/eportal.jar"]


# FROM 	nginx 
# RUN 	apt-get update
# COPY    //default.conf //etc/nginx/conf.d 
# EXPOSE 80
# CMD ["nginx", "-g", "daemon off;"]
