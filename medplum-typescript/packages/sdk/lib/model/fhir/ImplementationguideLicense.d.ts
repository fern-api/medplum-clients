export declare type ImplementationguideLicense = ImplementationguideLicense.Aal | ImplementationguideLicense.Abstyles | ImplementationguideLicense.Aladdin | ImplementationguideLicense.Amdplpa | ImplementationguideLicense.Aml | ImplementationguideLicense.Ampas;
export declare const ImplementationguideLicense: {
    Aal: ImplementationguideLicense.Aal;
    Abstyles: ImplementationguideLicense.Abstyles;
    Aladdin: ImplementationguideLicense.Aladdin;
    Amdplpa: ImplementationguideLicense.Amdplpa;
    Aml: ImplementationguideLicense.Aml;
    Ampas: ImplementationguideLicense.Ampas;
    _visit: <Result>(value: ImplementationguideLicense, visitor: ImplementationguideLicense._Visitor<Result>) => Result;
};
export declare namespace ImplementationguideLicense {
    type Aal = "AAL" & {
        __Aal: void;
    };
    type Abstyles = "Abstyles" & {
        __Abstyles: void;
    };
    type Aladdin = "Aladdin" & {
        __Aladdin: void;
    };
    type Amdplpa = "AMDPLPA" & {
        __Amdplpa: void;
    };
    type Aml = "AML" & {
        __Aml: void;
    };
    type Ampas = "AMPAS" & {
        __Ampas: void;
    };
    interface _Visitor<Result> {
        aal: () => Result;
        abstyles: () => Result;
        aladdin: () => Result;
        amdplpa: () => Result;
        aml: () => Result;
        ampas: () => Result;
        _unknown: () => Result;
    }
}
