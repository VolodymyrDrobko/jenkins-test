pipeline {
  agent any
          environment {
            userName = "vxd102"
            password = ""
            def suite = input message: 'Enter suite', parameters: [string(name: 'suite', defaultValue: 'test')]
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
        bat "mvn test -Dsuite=${env.suite} -f ${pomHome}"
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