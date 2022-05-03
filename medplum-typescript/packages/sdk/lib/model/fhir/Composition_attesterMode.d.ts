export declare type Composition_attesterMode = Composition_attesterMode.Personal | Composition_attesterMode.Professional | Composition_attesterMode.Legal | Composition_attesterMode.Official;
export declare const Composition_attesterMode: {
    Personal: Composition_attesterMode.Personal;
    Professional: Composition_attesterMode.Professional;
    Legal: Composition_attesterMode.Legal;
    Official: Composition_attesterMode.Official;
    _visit: <Result>(value: Composition_attesterMode, visitor: Composition_attesterMode._Visitor<Result>) => Result;
};
export declare namespace Composition_attesterMode {
    type Personal = "personal" & {
        __Personal: void;
    };
    type Professional = "professional" & {
        __Professional: void;
    };
    type Legal = "legal" & {
        __Legal: void;
    };
    type Official = "official" & {
        __Official: void;
    };
    interface _Visitor<Result> {
        personal: () => Result;
        professional: () => Result;
        legal: () => Result;
        official: () => Result;
        _unknown: () => Result;
    }
}
