# MyCli
     Easy Console Control, Same as Apache-commons-cli.
     
# Java Example:

     /**
      * Combox Option Object
      */
     Option helpOption = new Option()
                .Params(HELP.toString())
                .Desc("PrintHelp() function execute")
                .Comment("this is simple exmaple"")
                .build();
     CommandLine.Combox(helpOption);
     
     /**
      * Parser Option Objects on Command Lines
      */
     CommandLine cmd = Parse(args);

     // parse remaining options
     if (cmd.hasOption(HELP.toString())) {
         printHelp();
     }  
