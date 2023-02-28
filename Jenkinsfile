pipeline {
  agent none
        environment {
          userName = "vxd102"
          password = "default"
          suite = "test"
          pomHome = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
        }
        input {
            message "Select suite"
            parameters {
                    string(defaultValue: 'regression', name: 'suite')
                    password(defaultValue: 'password', name: 'password')
                    }
            }
  stages {
    stage('Build') {
    agent any

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