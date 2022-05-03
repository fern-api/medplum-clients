export declare type Capabilitystatement_resourceVersioning = Capabilitystatement_resourceVersioning.Versioned;
export declare const Capabilitystatement_resourceVersioning: {
    Versioned: Capabilitystatement_resourceVersioning.Versioned;
    _visit: <Result>(value: Capabilitystatement_resourceVersioning, visitor: Capabilitystatement_resourceVersioning._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_resourceVersioning {
    type Versioned = "versioned" & {
        __Versioned: void;
    };
    interface _Visitor<Result> {
        versioned: () => Result;
        _unknown: () => Result;
    }
}
