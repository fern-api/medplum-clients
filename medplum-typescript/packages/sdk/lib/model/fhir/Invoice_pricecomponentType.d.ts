export declare type Invoice_pricecomponentType = Invoice_pricecomponentType.Base | Invoice_pricecomponentType.Surcharge | Invoice_pricecomponentType.Deduction | Invoice_pricecomponentType.Discount | Invoice_pricecomponentType.Tax | Invoice_pricecomponentType.Informational;
export declare const Invoice_pricecomponentType: {
    Base: Invoice_pricecomponentType.Base;
    Surcharge: Invoice_pricecomponentType.Surcharge;
    Deduction: Invoice_pricecomponentType.Deduction;
    Discount: Invoice_pricecomponentType.Discount;
    Tax: Invoice_pricecomponentType.Tax;
    Informational: Invoice_pricecomponentType.Informational;
    _visit: <Result>(value: Invoice_pricecomponentType, visitor: Invoice_pricecomponentType._Visitor<Result>) => Result;
};
export declare namespace Invoice_pricecomponentType {
    type Base = "base" & {
        __Base: void;
    };
    type Surcharge = "surcharge" & {
        __Surcharge: void;
    };
    type Deduction = "deduction" & {
        __Deduction: void;
    };
    type Discount = "discount" & {
        __Discount: void;
    };
    type Tax = "tax" & {
        __Tax: void;
    };
    type Informational = "informational" & {
        __Informational: void;
    };
    interface _Visitor<Result> {
        base: () => Result;
        surcharge: () => Result;
        deduction: () => Result;
        discount: () => Result;
        tax: () => Result;
        informational: () => Result;
        _unknown: () => Result;
    }
}
