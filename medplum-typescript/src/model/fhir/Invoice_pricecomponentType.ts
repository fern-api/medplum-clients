export type Invoice_pricecomponentType =
    | Invoice_pricecomponentType.Base
    | Invoice_pricecomponentType.Surcharge
    | Invoice_pricecomponentType.Deduction
    | Invoice_pricecomponentType.Discount
    | Invoice_pricecomponentType.Tax
    | Invoice_pricecomponentType.Informational;

export const Invoice_pricecomponentType = {
    Base: "base" as Invoice_pricecomponentType.Base,
    Surcharge: "surcharge" as Invoice_pricecomponentType.Surcharge,
    Deduction: "deduction" as Invoice_pricecomponentType.Deduction,
    Discount: "discount" as Invoice_pricecomponentType.Discount,
    Tax: "tax" as Invoice_pricecomponentType.Tax,
    Informational: "informational" as Invoice_pricecomponentType.Informational,

    _visit: <Result>(value: Invoice_pricecomponentType, visitor: Invoice_pricecomponentType._Visitor<Result>): Result => {
        switch (value) {
            case Invoice_pricecomponentType.Base: return visitor.base();
            case Invoice_pricecomponentType.Surcharge: return visitor.surcharge();
            case Invoice_pricecomponentType.Deduction: return visitor.deduction();
            case Invoice_pricecomponentType.Discount: return visitor.discount();
            case Invoice_pricecomponentType.Tax: return visitor.tax();
            case Invoice_pricecomponentType.Informational: return visitor.informational();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Invoice_pricecomponentType {
    export type Base = "base" & {
        __Base: void,
    };
    export type Surcharge = "surcharge" & {
        __Surcharge: void,
    };
    export type Deduction = "deduction" & {
        __Deduction: void,
    };
    export type Discount = "discount" & {
        __Discount: void,
    };
    export type Tax = "tax" & {
        __Tax: void,
    };
    export type Informational = "informational" & {
        __Informational: void,
    };

    export interface _Visitor<Result> {
        base: () => Result;
        surcharge: () => Result;
        deduction: () => Result;
        discount: () => Result;
        tax: () => Result;
        informational: () => Result;
        _unknown: () => Result;
    }
}
