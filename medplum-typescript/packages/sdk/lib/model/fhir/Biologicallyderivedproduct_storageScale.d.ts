export declare type Biologicallyderivedproduct_storageScale = Biologicallyderivedproduct_storageScale.Farenheit | Biologicallyderivedproduct_storageScale.Celsius | Biologicallyderivedproduct_storageScale.Kelvin;
export declare const Biologicallyderivedproduct_storageScale: {
    Farenheit: Biologicallyderivedproduct_storageScale.Farenheit;
    Celsius: Biologicallyderivedproduct_storageScale.Celsius;
    Kelvin: Biologicallyderivedproduct_storageScale.Kelvin;
    _visit: <Result>(value: Biologicallyderivedproduct_storageScale, visitor: Biologicallyderivedproduct_storageScale._Visitor<Result>) => Result;
};
export declare namespace Biologicallyderivedproduct_storageScale {
    type Farenheit = "farenheit" & {
        __Farenheit: void;
    };
    type Celsius = "celsius" & {
        __Celsius: void;
    };
    type Kelvin = "kelvin" & {
        __Kelvin: void;
    };
    interface _Visitor<Result> {
        farenheit: () => Result;
        celsius: () => Result;
        kelvin: () => Result;
        _unknown: () => Result;
    }
}
