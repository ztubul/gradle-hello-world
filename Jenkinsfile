node('slave1') {
stage ('checkout'){
    checkout scm
 }
 stage ('build'){
 def gradle1 = tool 'gradle4'
 sh "${gradlehome/bin/gradle build"
 }
 }
