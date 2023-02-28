pipeline {
  agent any
          environment {
              suite = "test"
              pomHome = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
          }
  stages {
    stage('Build') {
      steps {
      bat "mvn clean -f ${pomHome}"
        echo "mvn clean using SUITE: ${env.suite}"
      }
    }

    stage('Test') {
      steps {
        echo "test stage"
      }
    }

    stage('Report') {
      steps {
        echo "Report stage"
      }
    }

  }
}