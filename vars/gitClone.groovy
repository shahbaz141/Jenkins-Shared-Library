def call(String url,String branch){
  echo "code is being pulled from GitHub"
  // Correct git step for pulling from the repository
  git url: ${url}, branch:${branch} 
    echo "code pulled successfully"
}
