export declare type Explanationofbenefit_processnoteType = Explanationofbenefit_processnoteType.Display | Explanationofbenefit_processnoteType.Print | Explanationofbenefit_processnoteType.Printoper;
export declare const Explanationofbenefit_processnoteType: {
    Display: Explanationofbenefit_processnoteType.Display;
    Print: Explanationofbenefit_processnoteType.Print;
    Printoper: Explanationofbenefit_processnoteType.Printoper;
    _visit: <Result>(value: Explanationofbenefit_processnoteType, visitor: Explanationofbenefit_processnoteType._Visitor<Result>) => Result;
};
export declare namespace Explanationofbenefit_processnoteType {
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
