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
     testData = readFile "test-data/names"
     println testData
     tests = testData.split('\n')
     branches = [:]
     for (test in tests){
         println "line is $test"
         entry = test.split(':')
         println "setting branch ${entry[0]} to use ${entry[1]}"
         key = entry[0]
         value = entry[1]
         branches[key] = {
            sh script : "test-data/int-test.sh build/libs/oto-gradle-1.0.jar ${key} '${value}'"
         }
      }
      parallel branches
    }

 }
