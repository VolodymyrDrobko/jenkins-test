pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'build stage - ${suite}'
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
        suite = "test"
    }

  }
}