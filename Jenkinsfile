pipeline {
    agent any

    environment {
      VERSION = '1.2'
    }

    stages {

      stage('SCM') {
        steps {
            echo 'checking out the code from SCM repository'
            git 'https://github.com/pythoncpp/jenkins-java-sample-app.git'
        }
      }

      stage('Build') {
        steps {
          echo "the code with version ${VERSION} is now building..."
          sh './gradlew build'
        }
      }

      stage('Test') {
        steps {
          echo "the code  with version ${VERSION} is now under testing phase..."
          sh './gradlew test'
        }
      }

      stage('Deploy') {
        input {
          message 'do you want to continue deploying the changes to the production environment?'
        }
        
        steps {
          echo "the code  with version ${VERSION} is getting deployed"
        }
      }
    }
}
