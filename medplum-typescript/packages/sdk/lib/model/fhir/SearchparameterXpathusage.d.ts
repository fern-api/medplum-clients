export declare type SearchparameterXpathusage = SearchparameterXpathusage.Normal | SearchparameterXpathusage.Phonetic | SearchparameterXpathusage.Nearby | SearchparameterXpathusage.Distance | SearchparameterXpathusage.Other;
export declare const SearchparameterXpathusage: {
    Normal: SearchparameterXpathusage.Normal;
    Phonetic: SearchparameterXpathusage.Phonetic;
    Nearby: SearchparameterXpathusage.Nearby;
    Distance: SearchparameterXpathusage.Distance;
    Other: SearchparameterXpathusage.Other;
    _visit: <Result>(value: SearchparameterXpathusage, visitor: SearchparameterXpathusage._Visitor<Result>) => Result;
};
export declare namespace SearchparameterXpathusage {
    type Normal = "normal" & {
        __Normal: void;
    };
    type Phonetic = "phonetic" & {
        __Phonetic: void;
    };
    type Nearby = "nearby" & {
        __Nearby: void;
    };
    type Distance = "distance" & {
        __Distance: void;
    };
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        normal: () => Result;
        phonetic: () => Result;
        nearby: () => Result;
        distance: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
