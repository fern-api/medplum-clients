export declare type IdentifierUse = IdentifierUse.Usual | IdentifierUse.Official | IdentifierUse.Temp | IdentifierUse.Secondary | IdentifierUse.Old;
export declare const IdentifierUse: {
    Usual: IdentifierUse.Usual;
    Official: IdentifierUse.Official;
    Temp: IdentifierUse.Temp;
    Secondary: IdentifierUse.Secondary;
    Old: IdentifierUse.Old;
    _visit: <Result>(value: IdentifierUse, visitor: IdentifierUse._Visitor<Result>) => Result;
};
export declare namespace IdentifierUse {
    type Usual = "usual" & {
        __Usual: void;
    };
    type Official = "official" & {
        __Official: void;
    };
    type Temp = "temp" & {
        __Temp: void;
    };
    type Secondary = "secondary" & {
        __Secondary: void;
    };
    type Old = "old" & {
        __Old: void;
    };
    interface _Visitor<Result> {
        usual: () => Result;
        official: () => Result;
        temp: () => Result;
        secondary: () => Result;
        old: () => Result;
        _unknown: () => Result;
    }
}
