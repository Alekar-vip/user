pipeline {
    agent any
    
    environment {
        // Aquí puedes definir variables de entorno si es necesario
        MY_VAR = 'ValorDeMiVariable'
    }

    stages {
        stage('Checkout') {
            steps {
                // Aquí hacemos checkout del código desde el repositorio
                git credentialsId: '00bbc145-33f2-45f1-a321-8377240aa087', url: 'https://github.com/Alekar-vip/user.git'
            }
        }
        
        /*stage('Build') {
            steps {
                // Aquí agregamos el paso de build
                echo 'Construyendo el proyecto...'
                sh './gradlew build'  // Por ejemplo, si tu proyecto usa Gradle
            }
        } */
        

        
        stage('Deploy') {
            steps {
                // Aquí agregamos el paso de despliegue
                echo 'Desplegando la aplicación...'
                // Agrega el comando de despliegue que necesites
            }
        }
    }

    post {
        success {
            echo 'Pipeline completado con éxito.'
        }
        failure {
            echo 'Hubo un error durante la ejecución del pipeline.'
        }
    }
}
