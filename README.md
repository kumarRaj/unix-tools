Unix Tools
----------

##Well this is a simple basic version of Unix Tools created in Java.

    To run it is very simple.
    You just have to download the scripts folder to your machine
    _____

    Get the jar file seperately and paste it inside
    your scripts folder.
    _____

    Add this folder to an environment variable.
         Name : `UNIX_TOOLS`
         Value : Path of your scripts folder.
    _____

    Thats all now you can run and test these commands.

##The following commands are available for your usage

    * rkCut -- Takes 2 arguments along with file name one delimiter and other field numbers.
                eg. rkCut File -d"," -f1,2
    * rkHead -- Takes 1 arguments along with file name which is Number of Lines.
                eg.  rkHead File
                     rkHead File -n5
    * rkTail -- Takes 1 arguments along with file name which is Number of Lines.
                eg.  rkTail File
                     rkTail File -n5
    * rkReduceBlanks -- Takes 1 arguments your file and replaces all occurrences of multiple spaces in it.
    * rkSOrt
