FROM centos:latest

RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-* && sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*

RUN yum install -y epel-release && yum install -y nginx

COPY  index.html /usr/share/nginx/html/index.html

EXPOSE 80


CMD ["nginx", "-g", "daemon off;"]
                                   
