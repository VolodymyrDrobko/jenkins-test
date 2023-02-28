pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'build stage'
          }
        }

        stage('Test') {
          steps {
            echo 'test stage'
          }
        }

      }
    }

    stage('Report') {
      steps {
        echo 'Report stage'
      }
    }

  }
}