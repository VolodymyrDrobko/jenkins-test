pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'build stage - ${suite-name}'
      }
    }

    stage('Test') {
      steps {
        echo 'test stage'
      }
    }

    stage('Report') {
      steps {
        echo 'Report stage'
      }
    }

    environment {
        suite-name = "test"
    }

  }
}