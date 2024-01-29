FROM 	nginx:latest
RUN 	apt-get update
COPY    //default.conf //etc/nginx/conf.d 
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]