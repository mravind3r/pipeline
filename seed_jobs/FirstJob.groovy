pipelineJob("my first seed job"){
    stages{
        stage("first"){
            steps{
                echo("hello world")
            }
        }
    }

}