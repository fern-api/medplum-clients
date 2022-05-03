export declare type Consent_dataMeaning = Consent_dataMeaning.Instance | Consent_dataMeaning.Related | Consent_dataMeaning.Dependents | Consent_dataMeaning.Authoredby;
export declare const Consent_dataMeaning: {
    Instance: Consent_dataMeaning.Instance;
    Related: Consent_dataMeaning.Related;
    Dependents: Consent_dataMeaning.Dependents;
    Authoredby: Consent_dataMeaning.Authoredby;
    _visit: <Result>(value: Consent_dataMeaning, visitor: Consent_dataMeaning._Visitor<Result>) => Result;
};
export declare namespace Consent_dataMeaning {
    type Instance = "instance" & {
        __Instance: void;
    };
    type Related = "related" & {
        __Related: void;
    };
    type Dependents = "dependents" & {
        __Dependents: void;
    };
    type Authoredby = "authoredby" & {
        __Authoredby: void;
    };
    interface _Visitor<Result> {
        instance: () => Result;
        related: () => Result;
        dependents: () => Result;
        authoredby: () => Result;
        _unknown: () => Result;
    }
}
