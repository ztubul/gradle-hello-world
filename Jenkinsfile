node { //optionally add node label: node (‘slave1’)
 gradle4 = tool 'gradle4'
 stage ('chekcout'){
    checkout scm
 }
 stage ('build')
 {
     sh "${gradle4}/bin/gradle clean jar"
 }
 stage ('unit-test')
 {
     sh "${gradle4}/bin/gradle test"
     junit "build/test-results/junit-platform/*.xml"
 }
 stage ('int-test')
 {
     branches = [:]
     for (i=1; i<=3; i++){
         branches["${i}"] = {
            testData = readFile "test-data/names${i}"
            println testData
            entry = testData.split(':')
            sh script : "test-data/int-test.sh build/libs/oto-gradle-1.0.jar ${entry[0]} '${entry[1]}'"
         }
      }
      parallel branches
    }

 }
