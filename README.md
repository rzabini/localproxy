# Localproxy  
A simple proxy which redirects all URls to localhost, to use in development.  
  
This is an alternative approach to the modification of the _hosts_ file on the local machine, as the developer:   
* may not have the permission to edit the _hosts_ file, or  
* may prefer to use two different browser instances, one pointing to the real site, and the other to the local site  
  
## Usage
Start the proxy server with:

    java -jar localproxy.jar <port>

Setup the browser to use the proxy on localhost:`<port>` (default port is 9999)
