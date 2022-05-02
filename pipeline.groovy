pipeline {
	agent any
	stages {
		stage('Checkout') { 
			steps {
				checkout([$class: 'GitSCM', branches: [[name: '*/09and10-CI']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/merkisam/DevOpsPath.git']]])
			}
		}
		stage('Build') {
			steps {
				sh 'cd backend && gradle init'
			}
		}
		stage('Test') { 
			steps {
				sh 'echo test'
			}
		}
		stage('Deploy') { 
			steps {
				sh 'echo deploy'
			}
		}
	}
}