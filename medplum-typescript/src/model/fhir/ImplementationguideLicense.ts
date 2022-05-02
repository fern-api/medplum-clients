export type ImplementationguideLicense =
    | ImplementationguideLicense.Aal
    | ImplementationguideLicense.Abstyles
    | ImplementationguideLicense.Aladdin
    | ImplementationguideLicense.Amdplpa
    | ImplementationguideLicense.Aml
    | ImplementationguideLicense.Ampas;

export const ImplementationguideLicense = {
    Aal: "AAL" as ImplementationguideLicense.Aal,
    Abstyles: "Abstyles" as ImplementationguideLicense.Abstyles,
    Aladdin: "Aladdin" as ImplementationguideLicense.Aladdin,
    Amdplpa: "AMDPLPA" as ImplementationguideLicense.Amdplpa,
    Aml: "AML" as ImplementationguideLicense.Aml,
    Ampas: "AMPAS" as ImplementationguideLicense.Ampas,

    _visit: <Result>(
        value: ImplementationguideLicense,
        visitor: ImplementationguideLicense._Visitor<Result>
    ): Result => {
        switch (value) {
            case ImplementationguideLicense.Aal:
                return visitor.aal();
            case ImplementationguideLicense.Abstyles:
                return visitor.abstyles();
            case ImplementationguideLicense.Aladdin:
                return visitor.aladdin();
            case ImplementationguideLicense.Amdplpa:
                return visitor.amdplpa();
            case ImplementationguideLicense.Aml:
                return visitor.aml();
            case ImplementationguideLicense.Ampas:
                return visitor.ampas();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ImplementationguideLicense {
    export type Aal = "AAL" & {
        __Aal: void;
    };
    export type Abstyles = "Abstyles" & {
        __Abstyles: void;
    };
    export type Aladdin = "Aladdin" & {
        __Aladdin: void;
    };
    export type Amdplpa = "AMDPLPA" & {
        __Amdplpa: void;
    };
    export type Aml = "AML" & {
        __Aml: void;
    };
    export type Ampas = "AMPAS" & {
        __Ampas: void;
    };

    export interface _Visitor<Result> {
        aal: () => Result;
        abstyles: () => Result;
        aladdin: () => Result;
        amdplpa: () => Result;
        aml: () => Result;
        ampas: () => Result;
        _unknown: () => Result;
    }
}
