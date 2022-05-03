export type Capabilitystatement_resourceVersioning =
    Capabilitystatement_resourceVersioning.Versioned;

export const Capabilitystatement_resourceVersioning = {
    Versioned: "versioned" as Capabilitystatement_resourceVersioning.Versioned,

    _visit: <Result>(
        value: Capabilitystatement_resourceVersioning,
        visitor: Capabilitystatement_resourceVersioning._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_resourceVersioning.Versioned:
                return visitor.versioned();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_resourceVersioning {
    export type Versioned = "versioned" & {
        __Versioned: void;
    };

    export interface _Visitor<Result> {
        versioned: () => Result;
        _unknown: () => Result;
    }
}
