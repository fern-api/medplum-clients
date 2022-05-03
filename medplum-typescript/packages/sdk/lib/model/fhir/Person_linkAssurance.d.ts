export declare type Person_linkAssurance = Person_linkAssurance.Level1 | Person_linkAssurance.Level2 | Person_linkAssurance.Level3 | Person_linkAssurance.Level4;
export declare const Person_linkAssurance: {
    Level1: Person_linkAssurance.Level1;
    Level2: Person_linkAssurance.Level2;
    Level3: Person_linkAssurance.Level3;
    Level4: Person_linkAssurance.Level4;
    _visit: <Result>(value: Person_linkAssurance, visitor: Person_linkAssurance._Visitor<Result>) => Result;
};
export declare namespace Person_linkAssurance {
    type Level1 = "level1" & {
        __Level1: void;
    };
    type Level2 = "level2" & {
        __Level2: void;
    };
    type Level3 = "level3" & {
        __Level3: void;
    };
    type Level4 = "level4" & {
        __Level4: void;
    };
    interface _Visitor<Result> {
        level1: () => Result;
        level2: () => Result;
        level3: () => Result;
        level4: () => Result;
        _unknown: () => Result;
    }
}
