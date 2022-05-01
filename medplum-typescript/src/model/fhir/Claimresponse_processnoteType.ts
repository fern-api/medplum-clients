export type Claimresponse_processnoteType =
    | Claimresponse_processnoteType.Display
    | Claimresponse_processnoteType.Print
    | Claimresponse_processnoteType.Printoper;

export const Claimresponse_processnoteType = {
    Display: "display" as Claimresponse_processnoteType.Display,
    Print: "print" as Claimresponse_processnoteType.Print,
    Printoper: "printoper" as Claimresponse_processnoteType.Printoper,

    _visit: <Result>(
        value: Claimresponse_processnoteType,
        visitor: Claimresponse_processnoteType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Claimresponse_processnoteType.Display:
                return visitor.display();
            case Claimresponse_processnoteType.Print:
                return visitor.print();
            case Claimresponse_processnoteType.Printoper:
                return visitor.printoper();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Claimresponse_processnoteType {
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
