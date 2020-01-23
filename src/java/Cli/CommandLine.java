package Cli;

import Cli.Option;

public class CommandLine
{
    public static CommandLine Commands = SingleTon.GetInstance(CommandLine.class);

    private static List<Option> optList = new ArrayList();

    private CommandLine() {
    }

    public static void Combox(Option _opt) {
        optList.addLast(_opt);
    }

    public static boolean HasOption(final String[] params) {
        return ((! IsSwitch(params)) && Parse(params));
    }

    private static boolean IsSwitch(final String[] params) {
		return (params == NULL && params.length <= 1);
	}

    private static boolean Parse(final String[] params) {
        for (Option opt : optList) {
            if (opt.getDescription().equals(params))
                return true;
        }
    }
}
