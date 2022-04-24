pipeline {
    agent any
    stages {
        stage('Run Test') {
            steps {
              sh './mvnw clean test'
            }
            post{
              always {
                 junit '**/surefire-reports/*.xml'
                }
            }
        }
    }
}