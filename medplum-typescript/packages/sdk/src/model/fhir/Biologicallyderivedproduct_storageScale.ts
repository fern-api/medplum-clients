export type Biologicallyderivedproduct_storageScale =
    | Biologicallyderivedproduct_storageScale.Farenheit
    | Biologicallyderivedproduct_storageScale.Celsius
    | Biologicallyderivedproduct_storageScale.Kelvin;

export const Biologicallyderivedproduct_storageScale = {
    Farenheit: "farenheit" as Biologicallyderivedproduct_storageScale.Farenheit,
    Celsius: "celsius" as Biologicallyderivedproduct_storageScale.Celsius,
    Kelvin: "kelvin" as Biologicallyderivedproduct_storageScale.Kelvin,

    _visit: <Result>(
        value: Biologicallyderivedproduct_storageScale,
        visitor: Biologicallyderivedproduct_storageScale._Visitor<Result>
    ): Result => {
        switch (value) {
            case Biologicallyderivedproduct_storageScale.Farenheit:
                return visitor.farenheit();
            case Biologicallyderivedproduct_storageScale.Celsius:
                return visitor.celsius();
            case Biologicallyderivedproduct_storageScale.Kelvin:
                return visitor.kelvin();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Biologicallyderivedproduct_storageScale {
    export type Farenheit = "farenheit" & {
        __Farenheit: void;
    };
    export type Celsius = "celsius" & {
        __Celsius: void;
    };
    export type Kelvin = "kelvin" & {
        __Kelvin: void;
    };

    export interface _Visitor<Result> {
        farenheit: () => Result;
        celsius: () => Result;
        kelvin: () => Result;
        _unknown: () => Result;
    }
}
