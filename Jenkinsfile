pipeline {
  agent any
          environment {
              suite.name = "test"
              pom.home = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
          }
  stages {
    stage('Build') {
      steps {
      bat "mvn clean -f ${pom.home}"
        echo "mvn clean using SUITE: ${env.suite.name}"
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