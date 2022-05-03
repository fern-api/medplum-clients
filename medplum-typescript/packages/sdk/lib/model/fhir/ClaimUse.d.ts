export declare type ClaimUse = ClaimUse.Claim | ClaimUse.Preauthorization | ClaimUse.Predetermination;
export declare const ClaimUse: {
    Claim: ClaimUse.Claim;
    Preauthorization: ClaimUse.Preauthorization;
    Predetermination: ClaimUse.Predetermination;
    _visit: <Result>(value: ClaimUse, visitor: ClaimUse._Visitor<Result>) => Result;
};
export declare namespace ClaimUse {
    type Claim = "claim" & {
        __Claim: void;
    };
    type Preauthorization = "preauthorization" & {
        __Preauthorization: void;
    };
    type Predetermination = "predetermination" & {
        __Predetermination: void;
    };
    interface _Visitor<Result> {
        claim: () => Result;
        preauthorization: () => Result;
        predetermination: () => Result;
        _unknown: () => Result;
    }
}
