export type ClaimUse =
    | ClaimUse.Claim
    | ClaimUse.Preauthorization
    | ClaimUse.Predetermination;

export const ClaimUse = {
    Claim: "claim" as ClaimUse.Claim,
    Preauthorization: "preauthorization" as ClaimUse.Preauthorization,
    Predetermination: "predetermination" as ClaimUse.Predetermination,

    _visit: <Result>(
        value: ClaimUse,
        visitor: ClaimUse._Visitor<Result>
    ): Result => {
        switch (value) {
            case ClaimUse.Claim:
                return visitor.claim();
            case ClaimUse.Preauthorization:
                return visitor.preauthorization();
            case ClaimUse.Predetermination:
                return visitor.predetermination();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ClaimUse {
    export type Claim = "claim" & {
        __Claim: void;
    };
    export type Preauthorization = "preauthorization" & {
        __Preauthorization: void;
    };
    export type Predetermination = "predetermination" & {
        __Predetermination: void;
    };

    export interface _Visitor<Result> {
        claim: () => Result;
        preauthorization: () => Result;
        predetermination: () => Result;
        _unknown: () => Result;
    }
}
