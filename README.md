Unix Tools
----------

##Well this is a simple basic version of Unix Tools created in Java.

    To run it is very simple.
    You just have to download the scripts folder to your machine.
    _____

    Add this folder to an environment variable.
         Name : `UNIX_TOOLS`
         Value : Path of your scripts folder.
    _____

    Thats all now you can run and test these commands.

##The following commands are available for your usage

    * rkCut -- Takes 2 arguments along with file name one delimiter and other field numbers.
                eg. rkCut File -d"," -f1,2
                    rkCut File -f1,2
    * rkHead -- Takes 1 arguments along with file name which is Number of Lines.
                By default displays first 10 lines.
                eg.  rkHead File
                     rkHead File -n5
    * rkTail -- Takes 1 arguments along with file name which is Number of Lines.
                By default displays last 10 lines.
                eg.  rkTail File
                     rkTail File -n5
    * rkReduceBlanks -- Takes 1 arguments your file and replaces all occurrences of multiple spaces in it.
                eg.  rkReduceBlanks File
    * rkSOrt -- Sorts the given file and displays it.
                eg.  sort File
    * rkWc  --  Takes a file and displays its Line Count,Word Count and Character Count.
                    eg.  rkWc File
    * rkUniq--  Takes a file and displays its consecutive lines if repeated without repetition.
                eg.  rkUniq File

