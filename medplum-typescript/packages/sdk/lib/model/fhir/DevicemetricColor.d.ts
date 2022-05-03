export declare type DevicemetricColor = DevicemetricColor.Black | DevicemetricColor.Red | DevicemetricColor.Green | DevicemetricColor.Yellow | DevicemetricColor.Blue | DevicemetricColor.Magenta | DevicemetricColor.Cyan | DevicemetricColor.White;
export declare const DevicemetricColor: {
    Black: DevicemetricColor.Black;
    Red: DevicemetricColor.Red;
    Green: DevicemetricColor.Green;
    Yellow: DevicemetricColor.Yellow;
    Blue: DevicemetricColor.Blue;
    Magenta: DevicemetricColor.Magenta;
    Cyan: DevicemetricColor.Cyan;
    White: DevicemetricColor.White;
    _visit: <Result>(value: DevicemetricColor, visitor: DevicemetricColor._Visitor<Result>) => Result;
};
export declare namespace DevicemetricColor {
    type Black = "black" & {
        __Black: void;
    };
    type Red = "red" & {
        __Red: void;
    };
    type Green = "green" & {
        __Green: void;
    };
    type Yellow = "yellow" & {
        __Yellow: void;
    };
    type Blue = "blue" & {
        __Blue: void;
    };
    type Magenta = "magenta" & {
        __Magenta: void;
    };
    type Cyan = "cyan" & {
        __Cyan: void;
    };
    type White = "white" & {
        __White: void;
    };
    interface _Visitor<Result> {
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
