export type Explanationofbenefit_processnoteType =
    | Explanationofbenefit_processnoteType.Display
    | Explanationofbenefit_processnoteType.Print
    | Explanationofbenefit_processnoteType.Printoper;

export const Explanationofbenefit_processnoteType = {
    Display: "display" as Explanationofbenefit_processnoteType.Display,
    Print: "print" as Explanationofbenefit_processnoteType.Print,
    Printoper: "printoper" as Explanationofbenefit_processnoteType.Printoper,

    _visit: <Result>(
        value: Explanationofbenefit_processnoteType,
        visitor: Explanationofbenefit_processnoteType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Explanationofbenefit_processnoteType.Display:
                return visitor.display();
            case Explanationofbenefit_processnoteType.Print:
                return visitor.print();
            case Explanationofbenefit_processnoteType.Printoper:
                return visitor.printoper();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Explanationofbenefit_processnoteType {
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
