pipeline {
	agent any
	stages {
		stage('Checkout') { 
			steps {
				echo 'Checkout',
				checkout([$class: 'GitSCM', branches: [[name: '*/09and10-CI']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/merkisam/DevOpsPath.git']]])
			}
		}
		stage('Build Backend') {
			steps {
				echo 'Build Backend',
				sh 'cd backend && gradle init'
			}
		}
		stage('Test Backend') { 
			steps {
				echo 'Test Backend',
				junit(
					allowEmptyResults: true,
					testResults: '**/test-results/test/*xml'
				)
			}
		}
		stage('Build frontend') { 
			steps {
				echo 'Build frontend',
				sh 'npm install --prefix frontend',
				sh 'npm run build --prefix frontend'
			}
		}
	}
}
