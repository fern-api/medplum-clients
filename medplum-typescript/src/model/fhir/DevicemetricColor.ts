export type DevicemetricColor =
    | DevicemetricColor.Black
    | DevicemetricColor.Red
    | DevicemetricColor.Green
    | DevicemetricColor.Yellow
    | DevicemetricColor.Blue
    | DevicemetricColor.Magenta
    | DevicemetricColor.Cyan
    | DevicemetricColor.White;

export const DevicemetricColor = {
    Black: "black" as DevicemetricColor.Black,
    Red: "red" as DevicemetricColor.Red,
    Green: "green" as DevicemetricColor.Green,
    Yellow: "yellow" as DevicemetricColor.Yellow,
    Blue: "blue" as DevicemetricColor.Blue,
    Magenta: "magenta" as DevicemetricColor.Magenta,
    Cyan: "cyan" as DevicemetricColor.Cyan,
    White: "white" as DevicemetricColor.White,

    _visit: <Result>(value: DevicemetricColor, visitor: DevicemetricColor._Visitor<Result>): Result => {
        switch (value) {
            case DevicemetricColor.Black: return visitor.black();
            case DevicemetricColor.Red: return visitor.red();
            case DevicemetricColor.Green: return visitor.green();
            case DevicemetricColor.Yellow: return visitor.yellow();
            case DevicemetricColor.Blue: return visitor.blue();
            case DevicemetricColor.Magenta: return visitor.magenta();
            case DevicemetricColor.Cyan: return visitor.cyan();
            case DevicemetricColor.White: return visitor.white();
            default: return visitor._unknown();
        }
    },
};

export declare namespace DevicemetricColor {
    export type Black = "black" & {
        __Black: void,
    };
    export type Red = "red" & {
        __Red: void,
    };
    export type Green = "green" & {
        __Green: void,
    };
    export type Yellow = "yellow" & {
        __Yellow: void,
    };
    export type Blue = "blue" & {
        __Blue: void,
    };
    export type Magenta = "magenta" & {
        __Magenta: void,
    };
    export type Cyan = "cyan" & {
        __Cyan: void,
    };
    export type White = "white" & {
        __White: void,
    };

    export interface _Visitor<Result> {
        black: () => Result;
        red: () => Result;
        green: () => Result;
        yellow: () => Result;
        blue: () => Result;
        magenta: () => Result;
        cyan: () => Result;
        white: () => Result;
        _unknown: () => Result;
    }
}
