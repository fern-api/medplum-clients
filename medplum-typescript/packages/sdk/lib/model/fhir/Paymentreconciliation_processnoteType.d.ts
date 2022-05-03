export declare type Paymentreconciliation_processnoteType = Paymentreconciliation_processnoteType.Display | Paymentreconciliation_processnoteType.Print | Paymentreconciliation_processnoteType.Printoper;
export declare const Paymentreconciliation_processnoteType: {
    Display: Paymentreconciliation_processnoteType.Display;
    Print: Paymentreconciliation_processnoteType.Print;
    Printoper: Paymentreconciliation_processnoteType.Printoper;
    _visit: <Result>(value: Paymentreconciliation_processnoteType, visitor: Paymentreconciliation_processnoteType._Visitor<Result>) => Result;
};
export declare namespace Paymentreconciliation_processnoteType {
    type Display = "display" & {
        __Display: void;
    };
    type Print = "print" & {
        __Print: void;
    };
    type Printoper = "printoper" & {
        __Printoper: void;
    };
    interface _Visitor<Result> {
        display: () => Result;
        print: () => Result;
        printoper: () => Result;
        _unknown: () => Result;
    }
}
