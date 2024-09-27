# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y los directorios necesarios
COPY pom.xml .
COPY src ./src

# Instalar Maven
RUN apt-get update && apt-get install -y maven

# Construir el proyecto
mvn install -DskipTests

# Ejecutar las pruebas
CMD ["mvn", "verify"]
