export type Composition_attesterMode =
    | Composition_attesterMode.Personal
    | Composition_attesterMode.Professional
    | Composition_attesterMode.Legal
    | Composition_attesterMode.Official;

export const Composition_attesterMode = {
    Personal: "personal" as Composition_attesterMode.Personal,
    Professional: "professional" as Composition_attesterMode.Professional,
    Legal: "legal" as Composition_attesterMode.Legal,
    Official: "official" as Composition_attesterMode.Official,

    _visit: <Result>(
        value: Composition_attesterMode,
        visitor: Composition_attesterMode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Composition_attesterMode.Personal:
                return visitor.personal();
            case Composition_attesterMode.Professional:
                return visitor.professional();
            case Composition_attesterMode.Legal:
                return visitor.legal();
            case Composition_attesterMode.Official:
                return visitor.official();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Composition_attesterMode {
    export type Personal = "personal" & {
        __Personal: void;
    };
    export type Professional = "professional" & {
        __Professional: void;
    };
    export type Legal = "legal" & {
        __Legal: void;
    };
    export type Official = "official" & {
        __Official: void;
    };

    export interface _Visitor<Result> {
        personal: () => Result;
        professional: () => Result;
        legal: () => Result;
        official: () => Result;
        _unknown: () => Result;
    }
}
