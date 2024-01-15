pipeline {
    agent any
    triggers {
        pollSCM('')
    }

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "m2"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage('Deploy') {
            steps {
                nexusArtifactUploader(
                        nexusVersion: 'nexus3',
                        protocol: 'http',
                        nexusUrl: '10.152.183.207:32145',
                        groupId: 'com.org.ma',
                        version: '0.0.1-SNAPSHOT',
                        repository: 'maven-snapshots',
                        credentialsId: 'nexus-pass',
                        artifacts: [
                            [artifactId: 'MessageAquisition',
                             classifier: 'debug',
                             file: 'target/MessageAquisition-0.0.1-SNAPSHOT.jar',
                             type: 'jar']
                        ]
                     )
            }
        }
    }
}