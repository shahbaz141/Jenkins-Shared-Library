def call(){
        echo "build will start soon"
        sh "docker build -t notesapp:latest ."
}
