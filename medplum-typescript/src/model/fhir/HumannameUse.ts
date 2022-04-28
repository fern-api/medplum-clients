export type HumannameUse =
    | HumannameUse.Usual
    | HumannameUse.Official
    | HumannameUse.Temp
    | HumannameUse.Nickname
    | HumannameUse.Anonymous
    | HumannameUse.Old
    | HumannameUse.Maiden;

export const HumannameUse = {
    Usual: "usual" as HumannameUse.Usual,
    Official: "official" as HumannameUse.Official,
    Temp: "temp" as HumannameUse.Temp,
    Nickname: "nickname" as HumannameUse.Nickname,
    Anonymous: "anonymous" as HumannameUse.Anonymous,
    Old: "old" as HumannameUse.Old,
    Maiden: "maiden" as HumannameUse.Maiden,

    _visit: <Result>(value: HumannameUse, visitor: HumannameUse._Visitor<Result>): Result => {
        switch (value) {
            case HumannameUse.Usual: return visitor.usual();
            case HumannameUse.Official: return visitor.official();
            case HumannameUse.Temp: return visitor.temp();
            case HumannameUse.Nickname: return visitor.nickname();
            case HumannameUse.Anonymous: return visitor.anonymous();
            case HumannameUse.Old: return visitor.old();
            case HumannameUse.Maiden: return visitor.maiden();
            default: return visitor._unknown();
        }
    },
};

export declare namespace HumannameUse {
    export type Usual = "usual" & {
        __Usual: void,
    };
    export type Official = "official" & {
        __Official: void,
    };
    export type Temp = "temp" & {
        __Temp: void,
    };
    export type Nickname = "nickname" & {
        __Nickname: void,
    };
    export type Anonymous = "anonymous" & {
        __Anonymous: void,
    };
    export type Old = "old" & {
        __Old: void,
    };
    export type Maiden = "maiden" & {
        __Maiden: void,
    };

    export interface _Visitor<Result> {
        usual: () => Result;
        official: () => Result;
        temp: () => Result;
        nickname: () => Result;
        anonymous: () => Result;
        old: () => Result;
        maiden: () => Result;
        _unknown: () => Result;
    }
}
