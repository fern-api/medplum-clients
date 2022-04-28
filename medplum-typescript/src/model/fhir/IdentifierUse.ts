export type IdentifierUse =
    | IdentifierUse.Usual
    | IdentifierUse.Official
    | IdentifierUse.Temp
    | IdentifierUse.Secondary
    | IdentifierUse.Old;

export const IdentifierUse = {
    Usual: "usual" as IdentifierUse.Usual,
    Official: "official" as IdentifierUse.Official,
    Temp: "temp" as IdentifierUse.Temp,
    Secondary: "secondary" as IdentifierUse.Secondary,
    Old: "old" as IdentifierUse.Old,

    _visit: <Result>(value: IdentifierUse, visitor: IdentifierUse._Visitor<Result>): Result => {
        switch (value) {
            case IdentifierUse.Usual: return visitor.usual();
            case IdentifierUse.Official: return visitor.official();
            case IdentifierUse.Temp: return visitor.temp();
            case IdentifierUse.Secondary: return visitor.secondary();
            case IdentifierUse.Old: return visitor.old();
            default: return visitor._unknown();
        }
    },
};

export declare namespace IdentifierUse {
    export type Usual = "usual" & {
        __Usual: void,
    };
    export type Official = "official" & {
        __Official: void,
    };
    export type Temp = "temp" & {
        __Temp: void,
    };
    export type Secondary = "secondary" & {
        __Secondary: void,
    };
    export type Old = "old" & {
        __Old: void,
    };

    export interface _Visitor<Result> {
        usual: () => Result;
        official: () => Result;
        temp: () => Result;
        secondary: () => Result;
        old: () => Result;
        _unknown: () => Result;
    }
}
