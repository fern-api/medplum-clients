export type Person_linkAssurance =
    | Person_linkAssurance.Level1
    | Person_linkAssurance.Level2
    | Person_linkAssurance.Level3
    | Person_linkAssurance.Level4;

export const Person_linkAssurance = {
    Level1: "level1" as Person_linkAssurance.Level1,
    Level2: "level2" as Person_linkAssurance.Level2,
    Level3: "level3" as Person_linkAssurance.Level3,
    Level4: "level4" as Person_linkAssurance.Level4,

    _visit: <Result>(
        value: Person_linkAssurance,
        visitor: Person_linkAssurance._Visitor<Result>
    ): Result => {
        switch (value) {
            case Person_linkAssurance.Level1:
                return visitor.level1();
            case Person_linkAssurance.Level2:
                return visitor.level2();
            case Person_linkAssurance.Level3:
                return visitor.level3();
            case Person_linkAssurance.Level4:
                return visitor.level4();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Person_linkAssurance {
    export type Level1 = "level1" & {
        __Level1: void;
    };
    export type Level2 = "level2" & {
        __Level2: void;
    };
    export type Level3 = "level3" & {
        __Level3: void;
    };
    export type Level4 = "level4" & {
        __Level4: void;
    };

    export interface _Visitor<Result> {
        level1: () => Result;
        level2: () => Result;
        level3: () => Result;
        level4: () => Result;
        _unknown: () => Result;
    }
}
