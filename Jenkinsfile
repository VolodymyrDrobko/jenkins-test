pipeline {
  agent none
  stages {
    stage('Build') {
    agent any
      environment {
        userName = "vxd102"
        password = password(name: 'Password', description: "Enter password")
        suite = input message: 'Enter suite', parameters: [string(name: 'suite', defaultValue: 'regression')]
        pomHome = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
      }
      steps {
        bat "mvn clean -f ${pomHome}"
        echo "mvn clean using SUITE: ${env.suite}"
      }
    }

    stage('Test') {
     agent any
      steps {
        bat "mvn test -Dsuite=${env.suite} -f ${pomHome}"
        echo "test stage"
      }
    }

    stage('Report') {
     agent any
      steps {
        echo "Report stage"
      }
    }

  }
}