export type SearchparameterXpathusage =
    | SearchparameterXpathusage.Normal
    | SearchparameterXpathusage.Phonetic
    | SearchparameterXpathusage.Nearby
    | SearchparameterXpathusage.Distance
    | SearchparameterXpathusage.Other;

export const SearchparameterXpathusage = {
    Normal: "normal" as SearchparameterXpathusage.Normal,
    Phonetic: "phonetic" as SearchparameterXpathusage.Phonetic,
    Nearby: "nearby" as SearchparameterXpathusage.Nearby,
    Distance: "distance" as SearchparameterXpathusage.Distance,
    Other: "other" as SearchparameterXpathusage.Other,

    _visit: <Result>(value: SearchparameterXpathusage, visitor: SearchparameterXpathusage._Visitor<Result>): Result => {
        switch (value) {
            case SearchparameterXpathusage.Normal: return visitor.normal();
            case SearchparameterXpathusage.Phonetic: return visitor.phonetic();
            case SearchparameterXpathusage.Nearby: return visitor.nearby();
            case SearchparameterXpathusage.Distance: return visitor.distance();
            case SearchparameterXpathusage.Other: return visitor.other();
            default: return visitor._unknown();
        }
    },
};

export declare namespace SearchparameterXpathusage {
    export type Normal = "normal" & {
        __Normal: void,
    };
    export type Phonetic = "phonetic" & {
        __Phonetic: void,
    };
    export type Nearby = "nearby" & {
        __Nearby: void,
    };
    export type Distance = "distance" & {
        __Distance: void,
    };
    export type Other = "other" & {
        __Other: void,
    };

    export interface _Visitor<Result> {
        normal: () => Result;
        phonetic: () => Result;
        nearby: () => Result;
        distance: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
