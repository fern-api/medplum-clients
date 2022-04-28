export type Consent_dataMeaning =
    | Consent_dataMeaning.Instance
    | Consent_dataMeaning.Related
    | Consent_dataMeaning.Dependents
    | Consent_dataMeaning.Authoredby;

export const Consent_dataMeaning = {
    Instance: "instance" as Consent_dataMeaning.Instance,
    Related: "related" as Consent_dataMeaning.Related,
    Dependents: "dependents" as Consent_dataMeaning.Dependents,
    Authoredby: "authoredby" as Consent_dataMeaning.Authoredby,

    _visit: <Result>(value: Consent_dataMeaning, visitor: Consent_dataMeaning._Visitor<Result>): Result => {
        switch (value) {
            case Consent_dataMeaning.Instance: return visitor.instance();
            case Consent_dataMeaning.Related: return visitor.related();
            case Consent_dataMeaning.Dependents: return visitor.dependents();
            case Consent_dataMeaning.Authoredby: return visitor.authoredby();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Consent_dataMeaning {
    export type Instance = "instance" & {
        __Instance: void,
    };
    export type Related = "related" & {
        __Related: void,
    };
    export type Dependents = "dependents" & {
        __Dependents: void,
    };
    export type Authoredby = "authoredby" & {
        __Authoredby: void,
    };

    export interface _Visitor<Result> {
        instance: () => Result;
        related: () => Result;
        dependents: () => Result;
        authoredby: () => Result;
        _unknown: () => Result;
    }
}
