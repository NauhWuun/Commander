package Cli;

import Cli.CommandLine;

public class Option
{
    private final String comment;
    private final String desc;
    private final String params;

    private Option _this;

    public Option() {
        _this = this;
    }

    public Option Comment(final String Comments) {
        this.comment = Comments;
        return _this;
    }

    public Option Desc(final String desc) {
        this.desc = desc;
        return _this;
    }

    public Option Params(final String _params) {
        this.params = _params;
        return _this;
    }

    public void Build() {
        if (! validator()) {
            System.out.println("comments or desc params has fault, pleaese check item");
        }

        Commands.Combox(_this);
    }

    private boolean validator() {
        return "".equals(comment) && "".equals(desc);
    }

    public String getComments() {
        return _this.comment;
    }

    public String getDescription() {
        return _this.desc;
    }

    public String getParameters() {
        return _this.params;
    }
}
