#!groovy
try{
  node ('xvfb'){
    stage('Checkout'){
      git 'https://github.com/glnds/geb-spock-greenfield.git'
    }
    stage('Test #1 - Firefox'){
      wrap([$class: 'Xvfb']) {
        sh "./gradlew --gradle-user-home /var/lib/jenkins/.gradle firefoxTest"
      }
    }
    stage('Test #2 - Chrome'){
      wrap([$class: 'Xvfb']) {
        sh "./gradlew --gradle-user-home /var/lib/jenkins/.gradle chromeTest"
      }
    }
  }
} catch (ex) {
  echo "Caught: ${ex}"

  String recipient = 'gert.leenders@persgroep.be'
  currentBuild.result = "FAILURE"
  mail subject: "${env.JOB_NAME} (${env.BUILD_NUMBER}) failed",
            body: "It appears that ${env.BUILD_URL} is failing, somebody should do something about that",
              to: recipient,
         replyTo: recipient,
            from: 'noreply@ci.jenkins.io'
} finally {
}
