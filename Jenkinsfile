pipeline {
 agent any
 environment {
 PATH = "${env.PATH};C:\\Windows\\System32" // Update the PATH to include the directory of cmd.exe
 GIT_CREDENTIALS = credentials('teemupulli')
 }

 stages {
 stage('Checkout') {
 steps {
 git branch: 'master', credentialsId: 'teemupulli', url: 'https://github.com/teemupulli/ftocelcius.git'
 }
 }
 stage('Build') {
 steps {
 bat 'mvn clean install'
 }
 }
 stage('Test') {
 steps{
 bat 'mvn test'
 }
 post {
 success {
 // Publish JUnit test results
 junit '**/target/surefire-reports/TEST-*.xml'
 // Generate JaCoCo code coverage report
 jacoco(execPattern: '**/target/jacoco.exec')
 }
 }
 }
 }
}