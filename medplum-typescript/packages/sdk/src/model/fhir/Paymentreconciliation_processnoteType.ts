export type Paymentreconciliation_processnoteType =
    | Paymentreconciliation_processnoteType.Display
    | Paymentreconciliation_processnoteType.Print
    | Paymentreconciliation_processnoteType.Printoper;

export const Paymentreconciliation_processnoteType = {
    Display: "display" as Paymentreconciliation_processnoteType.Display,
    Print: "print" as Paymentreconciliation_processnoteType.Print,
    Printoper: "printoper" as Paymentreconciliation_processnoteType.Printoper,

    _visit: <Result>(
        value: Paymentreconciliation_processnoteType,
        visitor: Paymentreconciliation_processnoteType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Paymentreconciliation_processnoteType.Display:
                return visitor.display();
            case Paymentreconciliation_processnoteType.Print:
                return visitor.print();
            case Paymentreconciliation_processnoteType.Printoper:
                return visitor.printoper();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Paymentreconciliation_processnoteType {
    export type Display = "display" & {
        __Display: void;
    };
    export type Print = "print" & {
        __Print: void;
    };
    export type Printoper = "printoper" & {
        __Printoper: void;
    };

    export interface _Visitor<Result> {
        display: () => Result;
        print: () => Result;
        printoper: () => Result;
        _unknown: () => Result;
    }
}
