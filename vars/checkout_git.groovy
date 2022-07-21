def checkout_git(java.lang.String repo) {
    
    echo "This is for checking out git code."
   git credentialsId:'krishnavamshi933',url:"git@github.com:krishnavamshi933/${repo}.git"

}

return this