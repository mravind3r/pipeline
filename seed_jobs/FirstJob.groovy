pipelineJob("my first seed job"){
    agent any
    stages{
        stage("first"){
            steps{
                echo("hello world")
            }
        }
    }

}