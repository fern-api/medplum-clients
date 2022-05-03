export declare type HumannameUse = HumannameUse.Usual | HumannameUse.Official | HumannameUse.Temp | HumannameUse.Nickname | HumannameUse.Anonymous | HumannameUse.Old | HumannameUse.Maiden;
export declare const HumannameUse: {
    Usual: HumannameUse.Usual;
    Official: HumannameUse.Official;
    Temp: HumannameUse.Temp;
    Nickname: HumannameUse.Nickname;
    Anonymous: HumannameUse.Anonymous;
    Old: HumannameUse.Old;
    Maiden: HumannameUse.Maiden;
    _visit: <Result>(value: HumannameUse, visitor: HumannameUse._Visitor<Result>) => Result;
};
export declare namespace HumannameUse {
    type Usual = "usual" & {
        __Usual: void;
    };
    type Official = "official" & {
        __Official: void;
    };
    type Temp = "temp" & {
        __Temp: void;
    };
    type Nickname = "nickname" & {
        __Nickname: void;
    };
    type Anonymous = "anonymous" & {
        __Anonymous: void;
    };
    type Old = "old" & {
        __Old: void;
    };
    type Maiden = "maiden" & {
        __Maiden: void;
    };
    interface _Visitor<Result> {
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
