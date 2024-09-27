# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y los directorios necesarios
COPY pom.xml .
COPY src ./src
COPY target ./target
# Instalar Maven
RUN apt-get update && apt-get install -y maven

# Construir el proyecto
#RUN mvn install -DskipTests

# Ejecutar las pruebas
CMD ["mvn", "verify"]
