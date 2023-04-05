package ast;

import parser.julParser;

public class Position {
    private int numligne ;
    private int posligne;

    public int getNumligne()
    {return numligne;}

    public int getPosligne()
    {return posligne;}
    Position (int Numligne, int Posligne){
        this.numligne = Numligne;
        this.posligne = Posligne;
    }

    static Position getPos(julParser.ExpContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    static Position getPos(julParser.ParamContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
    static Position getPos(julParser.PvContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
    static Position getPos(julParser.TypeContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
    static Position getPos(julParser.FunctionContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    static Position getPos(julParser.ProgramContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    static Position getPos(julParser.InstContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
}
