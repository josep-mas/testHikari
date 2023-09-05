# Getting Started

### Reference Documentation

For
further
reference,
please
consider
the
following
sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.15/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides

The
following
guides
illustrate
how
to
use
some
features
concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## MySql
docker run --hostname=3553cf820b93 --env=MYSQL_ROOT_PASSWORD=sa --env=PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin --env=GOSU_VERSION=1.16 --env=MYSQL_MAJOR=8.0 --env=MYSQL_VERSION=8.0.33-1.el8 --env=MYSQL_SHELL_VERSION=8.0.33-1.el8 --volume=/var/lib/mysql -p 3306:3306 -p 33060:33060 --runtime=runc -d mysql:latest

## prometheus
docker run -d --name prometheus-container -e TZ=UTC -p 9090:9090 -v D:\APPS_JAVA\ProvaHikari\prometheus.yml:/etc/prometheus/prometheus.yml  ubuntu/prometheus 