def call(String id) {
    echo "Pushing the image to the Docker Hub repo"
    withCredentials([usernamePassword(credentialsId: "${id}", passwordVariable: 'password', usernameVariable: 'username')]) {
        sh "docker login -u ${env.username} -p ${env.password}"
        sh "docker image tag notesapp:latest shahbaz141/notesapp:latest"
        sh "docker push shahbaz141/notesapp:latest"
        echo "Login successful and image pushed to Docker Hub"
    }
}
